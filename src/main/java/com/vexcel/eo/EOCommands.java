package com.vexcel.eo;

import java.io.IOException;
import java.util.concurrent.Callable;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "EO Commands", mixinStandardHelpOptions = true, version = "1.0", description = "Do some various manipulations of an EO File.")
public class EOCommands implements Callable<Integer> {

    @Option(names = { "-c", "--command" }, required = true, description = "The command to run: sortAscending, sortDescending, min, max")
    String command;

    @Option(names = { "-f", "--field" }, required = true, description = "The field to calculate")
    String field;

    @Option(names = { "-s", "--source"}, required = true, description = "The path to the source EO .txt file")
    String source;

    @Override
    public Integer call() throws Exception {
        ExteriorOrientationDecoder decoder = new ExteriorOrientationDecoder();
        
        try {
            ExteriorOrientationModel model = decoder.decode(source);
            if (model.get(0).get(field).equals("INVALID")) {
                System.out.println("Invalid field!");
                return 1;
            } else {
                if (command.equals("sortAscending")) {
                    model.sortAscending(field);
                    for (int i=0; i < model.size(); i++) {
                        ExteriorOrientation exteriorOrientation = model.get(i);
                        System.out.println(exteriorOrientation.get(field));
                    }
                    return 0;
    
                } else if (command.equals("sortDescending")) {
                    model.sortDescending(field);
                    for (int i=0; i < model.size(); i++) {
                        ExteriorOrientation exteriorOrientation = model.get(i);
                        System.out.println(exteriorOrientation.get(field));
                    }
                    return 0;
                } else if (command.equals("min")) {
                    System.out.println(model.getMin(field));
                    return 0;
                } else if (command.equals("max")) {
                    System.out.println(model.getMax(field));
                    return 0;
                } else {
                    System.out.println("Invalid command!");
                    return 1;
                }
            }
        } catch (IOException exception) {
            System.out.println("File not found!");
            return 1;
        }


    }

    public static void main(String... args) {
        int exitCode = new CommandLine(new EOCommands()).execute(args);
        System.exit(exitCode);

    }

}

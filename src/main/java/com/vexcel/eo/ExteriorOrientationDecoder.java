package com.vexcel.eo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ExteriorOrientationDecoder {

    public ExteriorOrientationDecoder() {
    }

    public ExteriorOrientationModel decode(String aSource) throws IOException {
        ExteriorOrientationModel model = new ExteriorOrientationModel();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(aSource));
            String line;
            while ((line = reader.readLine()) != null) {
                String content = line.trim();
                if (content.length() > 0) {
                    if (!content.startsWith("#")) {
                        model.add(createExteriorOrientation(content));
                    }
                }
            }
            reader.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            throw e;
        }

        return model;
    }

    private ExteriorOrientation createExteriorOrientation(String aLine) {
        Scanner scanner = new Scanner(aLine);
        ExteriorOrientation exteriorOrientation = new ExteriorOrientation(Integer.parseInt(scanner.next()));
        exteriorOrientation.setTime(Double.parseDouble(scanner.next()));
        exteriorOrientation.setEasting(Double.parseDouble(scanner.next()));
        exteriorOrientation.setNorthing(Double.parseDouble(scanner.next()));
        exteriorOrientation.setHeight(Double.parseDouble(scanner.next()));
        exteriorOrientation.setOmega(Double.parseDouble(scanner.next()));
        exteriorOrientation.setPhi(Double.parseDouble(scanner.next()));
        exteriorOrientation.setKappa(Double.parseDouble(scanner.next()));
        exteriorOrientation.setSXyz(Double.parseDouble(scanner.next()));
        exteriorOrientation.setSPhiOmega(Double.parseDouble(scanner.next()));
        exteriorOrientation.setSKappa(Double.parseDouble(scanner.next()));

        scanner.close();

        return exteriorOrientation;
    }

}

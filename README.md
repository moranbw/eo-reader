# eo-reader

Read an Exterior Orientation file from disk, and run various commands on it, on any field.

---
## instructions:
```
Usage: EO Commands [-hV] -c=<command> -f=<field> -s=<source>
Do some various manipulations of an EO File.
  -c, --command=<command>   The command to run: sortAscending, sortDescending,
                              min, max
  -f, --field=<field>       The field to calculate
  -h, --help                Show this help message and exit.
  -s, --source=<source>     The path to the source EO .txt file
  -V, --version             Print version information and exit.
```
- **sortAscending**
```
java -jar eo-reader-1.0.jar --command="sortAscending" --field="NORTHING" --source="/home/Sample_Condor_EO.txt" 
```

- **sortDescending**
```
java -jar eo-reader-1.0.jar --command="sortDescending" --field="EASTING" --source="/home/Sample_Condor_EO.txt" 
```

- **min**
```
java -jar eo-reader-1.0.jar --command="min" --field="HEIGHT" --source="/home/Sample_Condor_EO.txt" 
```

- **max**
```
java -jar eo-reader-1.0.jar --command="max" --field="S_KAPPA" --source="/home/Sample_Condor_EO.txt" 
```
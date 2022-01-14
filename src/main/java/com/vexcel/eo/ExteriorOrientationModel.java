package com.vexcel.eo;

import java.util.ArrayList;
import java.util.Comparator;

public class ExteriorOrientationModel extends ArrayList<ExteriorOrientation> {


    public void sortAscending(String aField) {
        switch (aField) {
            case "PHOTOID":
                this.sort(Comparator.comparingInt(ExteriorOrientation::getPhotoId));
                break;
            case "TIME":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getTime));
                break;
            case "EASTING":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getEasting));
                break;
            case "NORTHING":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getNorthing));
                break;
            case "HEIGHT":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getHeight));
                break;
            case "OMEGA":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getOmega));
                break;
            case "PHI":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getPhi));
                break;
            case "KAPPA":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getKappa));
                break;
            case "S_XYZ":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getSXyz));
                break;
            case "S_PHI/OMEGA":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getSPhiOmega));
                break;
            case "S_KAPPA":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getKappa));
                break;
        }
    }

    public void sortDescending(String aField) {
        switch (aField) {
            case "PHOTOID":
                this.sort(Comparator.comparingInt(ExteriorOrientation::getPhotoId).reversed());
                break;
            case "TIME":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getTime).reversed());
                break;
            case "EASTING":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getEasting).reversed());
                break;
            case "NORTHING":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getNorthing).reversed());
                break;
            case "HEIGHT":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getHeight).reversed());
                break;
            case "OMEGA":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getOmega).reversed());
                break;
            case "PHI":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getPhi).reversed());
                break;
            case "KAPPA":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getKappa).reversed());
                break;
            case "S_XYZ":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getSXyz).reversed());
                break;
            case "S_PHI/OMEGA":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getSPhiOmega).reversed());
                break;
            case "S_KAPPA":
                this.sort(Comparator.comparingDouble(ExteriorOrientation::getKappa).reversed());
                break;
        }

    }

    public Object getMax(String aField) {
        this.sortDescending(aField);
        ExteriorOrientation exteriorOrientation = this.get(0);
        return exteriorOrientation.get(aField);
    }

    public Object getMin(String aField) {
        this.sortAscending(aField);
        ExteriorOrientation exteriorOrientation = this.get(0);        
        return exteriorOrientation.get(aField);
    }

}

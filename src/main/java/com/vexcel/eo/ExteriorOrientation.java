package com.vexcel.eo;
public class ExteriorOrientation {
    private int photoId;
    private double time;
    private double easting;
    private double northing;
    private double height;
    private double omega;
    private double phi;
    private double kappa;
    private double sXyz;
    private double sPhiOmega;
    private double sKappa;

    public ExteriorOrientation(Integer aPhotoId, double aTime, double aNorthing, double aHeight,
    double aOmega, double aPhi, double aKappa, double aSxyz, double aSphiOmega, double aSkappa) {
        this.photoId = aPhotoId;
        this.time = aTime;
        this.northing = aNorthing;
        this.height = aHeight;
        this.omega = aOmega;
        this.phi = aPhi;
        this.kappa = aKappa;
        this.sXyz = aSxyz;
        this.sPhiOmega = aSphiOmega;
        this.sKappa = aSkappa;
    }

    public ExteriorOrientation (Integer aPhotoId) {
        this.photoId = aPhotoId;
    }

    public Integer getPhotoId() {
        return this.photoId;
    }

    public void setPhotoId(Integer aPhotoId) {
        this.photoId = aPhotoId;
    }

    public double getTime() {
        return this.time;
    }

    public void setTime(double aTime) {
        this.time = aTime;
    }

    public double getEasting() {
        return this.easting;
    }

    public void setEasting(double aEasting) {
        this.easting = aEasting;
    }

    public double getNorthing() {
        return this.northing;
    }

    public void setNorthing(double aNorthing) {
        this.northing = aNorthing;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double aHeight) {
        this.height = aHeight;
    }

    public double getOmega() {
        return this.omega;
    }

    public void setOmega(double aOmega) {
        this.omega = aOmega;
    }

    public double getPhi() {
        return this.phi;
    }

    public void setPhi(double aPhi) {
        this.phi = aPhi;
    }

    public double getKappa() {
        return this.kappa;
    }

    public void setKappa(double aKappa) {
        this.kappa = aKappa;
    }

    public double getSXyz() {
        return this.sXyz;
    }

    public void setSXyz(double aSxyz) {
        this.sXyz = aSxyz;
    }

    public double getSPhiOmega() {
        return this.sPhiOmega;
    }

    public void setSPhiOmega(double aSphiOmega) {
        this.sPhiOmega = aSphiOmega;
    }

    public double getSKappa() {
        return this.sKappa;
    }

    public void setSKappa(double aSkappa) {
        this.sKappa = aSkappa;
    }

    public Object get(String aField) {
        switch (aField) {
            case "PHOTOID":
                return this.getPhotoId();
            case "TIME":
                return this.getTime();
            case "EASTING":
                return this.getEasting();
            case "NORTHING":
                return this.getNorthing();
            case "HEIGHT":
                return this.getHeight();
            case "OMEGA":
                return this.getOmega();
            case "PHI":
                return this.getPhi();
            case "KAPPA":
                return this.getKappa();
            case "S_XYZ":
                return this.getSXyz();
            case "S_PHI/OMEGA":
                return this.getSPhiOmega();
            case "S_KAPPA":
                return this.getSKappa();
            default:
                return "INVALID";
        }
    }
 

}
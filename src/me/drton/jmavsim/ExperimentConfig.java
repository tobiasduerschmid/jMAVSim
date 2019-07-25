package me.drton.jmavsim;

import javax.vecmath.Vector3d;

public class ExperimentConfig {

    public static double noise_acc;
    public static double noise_gyo;
    public static double noise_mag;
    public static double noise_prs;
    public static boolean deactivate_sensors;  // if true, then don't create SimpleSensor
    public static boolean ignore_gravity;
    public static String rotor_orientation;    // set how the rotors are oriented ("x" or "+")
    public static Vector3d gravity;    // need 3 values and can create this in main then pass to setG() in SimpleEnvironment
    public static Vector3d windDeviation; 
    public static Vector3d wind;
    public static Vector3d magField;     // need 3 values, can create in main then pass to setMagField() in Environment


    public ExperimentConfig() {
        deactivate_sensors = false;
        ignore_gravity = false;
        rotor_orientation = "x";      // default is "x"

    }

}

package me.drton.jmavsim;

import javax.vecmath.Vector3d;

public class ExperimentConfig {

    public static boolean deactivate_sensors;
//    public static boolean ignore_gravity;
    public static String rotor_orientation;    // set how the rotors are oriented ("x" or "+")
    public static Vector3d gravity;    // need 3 values and can create this in main then pass to setG() in SimpleEnvironment
    public static double ground_level;     // use setGroundLevel() in Environment
    public static Vector3d magField;     // need 3 values, can create in main then pass to setMagField() in Environment

//    public static boolean change_ground_level;
//    public static boolean change_gravity;
//    public static boolean change_r_orientation;
//    public static boolean change_mag;

    public ExperimentConfig() {
        deactivate_sensors = false;
//        ignore_gravity = false;
        rotor_orientation = "x";      // default is "x"
//        change_gravity = false;
//        change_ground_level = false;
//        change_r_orientation = false;
//        change_mag = false;

    }

}

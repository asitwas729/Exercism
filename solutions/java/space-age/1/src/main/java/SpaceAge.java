class SpaceAge {
    double seconds = 0;
    double year = 31_557_600;
    double mercury = 0.240_846_7;
    double venus = 0.615_197_26;
    double mars = 1.880_815_8;
    double jupiter = 11.862_615;
    double saturn = 29.447_498;
    double uranus = 84.016_846;
    double neptune = 164.791_32;
    
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / year;
    }

    double onMercury() {
        return onEarth() / mercury;
    }

    double onVenus() {
        return onEarth() / venus;
    }

    double onMars() {
        return onEarth() / mars;
    }

    double onJupiter() {
        return onEarth() / jupiter;
    }

    double onSaturn() {
        return onEarth() / saturn;
    }

    double onUranus() {
        return onEarth() / uranus;
    }

    double onNeptune() {
        return onEarth() / neptune;
    }

}

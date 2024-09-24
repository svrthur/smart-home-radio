package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    // Методы для управления радиостанциями
    public void nextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void setStation(int station) {
        if (station >= 0 && station <= 9) {
            this.currentStation = station;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    // Методы для управления громкостью
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.currentVolume = volume;
        }
    }
}

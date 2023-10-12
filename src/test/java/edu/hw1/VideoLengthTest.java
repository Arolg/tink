package edu.hw1;

import org.junit.jupiter.api.Test;

class VideoLengthTest {
    @Test
    void minutesToSeconds1() {
        VideoLength test = new VideoLength();
        String time = "01:00";
        int response = test.minutesToSeconds(time);
        org.assertj.core.api.Assertions.assertThat(response).isEqualTo(60);

    }
    @Test
    void minutesToSeconds2() {
        VideoLength test = new VideoLength();
        String time = "00:10";
        int response = test.minutesToSeconds(time);
        org.assertj.core.api.Assertions.assertThat(response).isEqualTo(10);

    }
    @Test
    void minutesToSeconds3() {
        VideoLength test = new VideoLength();
        String time = "01:60";
        int response = test.minutesToSeconds(time);
        org.assertj.core.api.Assertions.assertThat(response).isEqualTo(-1);

    }
}

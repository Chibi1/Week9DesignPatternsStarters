package observer;

import model.LectureModule;

import java.util.ArrayList;
import java.util.List;

public interface LectureObserver {
    void update(LectureModule lectureModule);
}

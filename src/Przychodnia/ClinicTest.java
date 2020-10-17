package Przychodnia;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Hyperbook on 10/11/2020
 **/
@RunWith(MockitoJUnitRunner.class)
class ClinicTest {
    private static final String PATIENT_1= "Michał Jankowski";
    private static final String PATIENT_2= "Dawid Jankowski";
    private static final String PATIENT_3= "Patryk Jankowski";

    @InjectMocks
    private Clinic testee;
}

package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestMatHangBus.class, TestMatHangDTO.class,TestMatHangDAO.class,TestTachChuoi.class })
public class AllUnitTests {

}

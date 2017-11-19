package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestDB.class, TestFunctionLoadDanhSachMatHang.class, TestFunctionThemMatHang.class,
		TestFunctionXoaMatHang.class, TestFunctionSuaMatHang.class })
public class AllIntegrationTests {

}

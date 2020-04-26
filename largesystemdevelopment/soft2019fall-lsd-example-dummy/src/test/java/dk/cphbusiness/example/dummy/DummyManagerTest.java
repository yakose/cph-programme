package dk.cphbusiness.example.dummy;

import dk.cphbusiness.example.contract.PersonManagerTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectClasses({HolderSetupTest.class, PersonManagerTest.class})
public class DummyManagerTest { }

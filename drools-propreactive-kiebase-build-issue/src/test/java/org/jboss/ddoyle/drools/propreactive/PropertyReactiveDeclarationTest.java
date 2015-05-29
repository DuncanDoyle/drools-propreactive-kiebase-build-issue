package org.jboss.ddoyle.drools.propreactive;

import org.junit.Test;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.builder.KieModule;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieContainer;

public class PropertyReactiveDeclarationTest {
	
	@Test
    public void testPropertyReactiveDeclarationExternalDrlOk() {
        KieServices kieServices = KieServices.Factory.get();
        Resource notOKResource = kieServices.getResources().newClassPathResource("OK");
        KieModule kieModule = kieServices.getRepository().addKieModule(notOKResource);
		KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
        KieBase kieBase = kieContainer.getKieBase();
    }
	
	@Test
    public void testPropertyReactiveDeclarationExternalDrlNotOK() {
        KieServices kieServices = KieServices.Factory.get();
        Resource notOKResource = kieServices.getResources().newClassPathResource("notOK");
        KieModule kieModule = kieServices.getRepository().addKieModule(notOKResource);
		KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
        KieBase kieBase = kieContainer.getKieBase();
    }

}

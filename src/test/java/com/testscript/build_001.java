package com.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.lib.General;

public class build_001 {
	@Test
	public void execute() throws Exception {
	DOMConfigurator.configure("log4j.xml");
	General g=new General();
	g.build_001();

}
	}


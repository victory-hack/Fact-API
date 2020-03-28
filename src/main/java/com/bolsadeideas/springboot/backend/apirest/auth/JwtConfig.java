  package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
	
	public static final String RSA_PUBLIC = "-----BEGIN PUBLIC KEY-----\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA0OqBxBJRC0+dvnIAgCcI\n" + 
			"vqlCTDKud/BflMRFpFSlyZPuA0uHMoTMawM7QEGu5IgkmTFfjNsVlcuD3EoPIlLU\n" + 
			"KILHCmYXgXG2IQm+ENcl/kWwmyrAz8W8pyc85YVYSedlQTIihrd4Bmwr0gUffI99\n" + 
			"yvTml3sf9t3R/ycrjsFqUJwLPqhZnuwBoQE56fzZm1FIlTmNSFKOU0syQ2jTvMK7\n" + 
			"8scPQBScuEWwhSXJAPUa/bpV6XoGtAkvHSNrRj1S0DghzrnNW9ih0mxaxhYb4pD4\n" + 
			"o7WTm/xPahwx3SjvCpbyEWF2db8EKK5O4gVUsipQimd3c+TbNnL61xd2pTdjwRkl\n" + 
			"dwIDAQAB\n" + 
			"-----END PUBLIC KEY-----";
	public static final String RSA_PRIVATE = "-----BEGIN RSA PRIVATE KEY-----\n" + 
			"MIIEpQIBAAKCAQEA0OqBxBJRC0+dvnIAgCcIvqlCTDKud/BflMRFpFSlyZPuA0uH\n" + 
			"MoTMawM7QEGu5IgkmTFfjNsVlcuD3EoPIlLUKILHCmYXgXG2IQm+ENcl/kWwmyrA\n" + 
			"z8W8pyc85YVYSedlQTIihrd4Bmwr0gUffI99yvTml3sf9t3R/ycrjsFqUJwLPqhZ\n" + 
			"nuwBoQE56fzZm1FIlTmNSFKOU0syQ2jTvMK78scPQBScuEWwhSXJAPUa/bpV6XoG\n" + 
			"tAkvHSNrRj1S0DghzrnNW9ih0mxaxhYb4pD4o7WTm/xPahwx3SjvCpbyEWF2db8E\n" + 
			"KK5O4gVUsipQimd3c+TbNnL61xd2pTdjwRkldwIDAQABAoIBABdlG3EEiBTXLpgE\n" + 
			"FjBDrsQDGkyEJGuD/IAhVpcnb4VaTn4J+DLdEjMtonX4pQgsgsSw9b1FT2594t9J\n" + 
			"X9Z9Jgr/UiDE+/7f6ABdIe6q2TNXRIary/m4b/7b8wLU4uUrx3f8kEc7xnIZrPKQ\n" + 
			"5kzBmNmggS4XeKXhg0GqdkM/P5OVIgDPG/ew6wsnn6TEE6xv7H+h5GJIxqPd/ckY\n" + 
			"gQ4AeaEuF+XX5iXjZ3obZ5yr9IWGDl1TDKpEpTFfFFMU6n7dobsFSZ2ueswmdIYB\n" + 
			"4NU4OmppgAujUfTST3SOCi5friTIWTTkJwtP3SPdL/dyJG0DmLgTnDACnG8UAaFD\n" + 
			"7LO107kCgYEA9JFV10aqfInbo7QflKy5Cbh85KzLJJiGXinCNGxffwrjZx3VT64f\n" + 
			"fPOY/cOelClfaoxI+MnTV6StopIlXaMalP45+/QpiI4tmoBfdGgvKq3PXimJE4jm\n" + 
			"gFinxbJ7j9QvAw39OquUqDnPVLV45We8BayibMM1RByrJp3BkxsZewUCgYEA2q6K\n" + 
			"DJ/febdfQQO/mqeE2nO6ZAXp9Sp5bOpx+tyqRVMOjyAgZUpHONpReBzguRP1w906\n" + 
			"wIAWiUyRoWurfTB1rSmNgSRtidgaCBQY2l4gGWxTuQSGFZvsrOr4kn/XscERu1Lr\n" + 
			"eTVrrZK/O3BkrqlrKn2coJ+5CqFuoAEgkHFyn0sCgYEA4KH5CWFDyF3LGoKgGyvG\n" + 
			"TXJhbJx1feiGSkjqssHzuLmkgxr4yVXyYA9Sr4qUxht2I2Q0xiaCcta0EUVRAr+D\n" + 
			"8+PKGGx8FYwZwPY2NrJW2EmK1T8rQ4ETzkEf4Er+iO3oPFMGC3R7d0SZ9YE1SOhN\n" + 
			"35xgF6v46dW3MiHmIZrbfY0CgYEAsglfwx915bZxCpFusQ6pjuChY0WdUEigSxgk\n" + 
			"a8Szq3UPaV8SgOSUT6kOoud/3a5ubGP0rTybHHUGK5FpMKb/Z1dpKTbrJ0qVBva1\n" + 
			"tTLkl04ma39PWtBzQ+SZM0x54vH46bV8mFXxsILExjOfBMRRx2o01mCzWgBL/GBu\n" + 
			"jqqOUzkCgYEAqjsFRNPUQbGsTFAjzV40C3ag0X3U0qCmW2xZK7ORHEch7TPVgfBQ\n" + 
			"/fyx9EdwQ8BCAAtGeYdrAgnFifBBj30PUPltt4t9WLeH3xtVLXiPu+wXTxCNmYc+\n" + 
			"PGhSYrcdJaJ66/pguJzvCNoHql5AbY2XfGeLhrUpvMzp7WRrdgA6XFE=\n" + 
			"-----END RSA PRIVATE KEY-----";
}

package com.java8;

import java.security.Key;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.*;
import sun.misc.*;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Demo {
	
	private static final String ALGO = "AES";
    private static final byte[] keyValue = 
        new byte[] { 'T', 'h', 'e', 'B', 'e', 's', 't','S', 'e', 'c', 'r','e', 't', 'K', 'e', 'y' };
	public static String encrypt(String Data) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(Data.getBytes());
        String encryptedValue = new BASE64Encoder().encode(encVal);
        return encryptedValue;
    }
	public static String decrypt(String encryptedData) throws Exception {
        Key key = generateKey();
        Cipher c = Cipher.getInstance(ALGO);
        c.init(Cipher.DECRYPT_MODE, key);
        byte[] decordedValue = new BASE64Decoder().decodeBuffer(encryptedData);
        byte[] decValue = c.doFinal(decordedValue);
        String decryptedValue = new String(decValue);
        return decryptedValue;
    }
	
	
	private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGO);
        System.out.println("key :"+key);
        return key;
}
	
	 public static boolean isRestrictedBranch(String restrictedBranches) {
	    	String l_restrictedBranches = restrictedBranches;
	    	if(l_restrictedBranches == null){
	    		return true;
	    	}
	    	String restrictedBranchComponents[] = restrictedBranches.split(",");
	    	for(String restrictedBranch : restrictedBranchComponents){
	    		if(restrictedBranch.equals("feature"))
	    			  return true;
	    	}
	        return false;
	    }
	    
	public static void main(String[] args) throws Exception {
		System.out.println(isRestrictedBranch("master,release"));
		System.out.println(isRestrictedBranch("master"));
		System.out.println(isRestrictedBranch("release"));
		System.out.println(isRestrictedBranch("master1,release"));
		System.out.println(isRestrictedBranch(null));
		System.out.println("Inside Main Method");
	}
	}
	
    

/*
 * 
		//String pathInfo = "JIRA/101/JITIN/01";
		int[] versions = {0, 0, 0};
		String pathInfo = "1.1.0.1-0";
		//String[] pathComponents = pathInfo.split("/");
		//System.out.println(versions.length + 1);
		String[] pathComponents =pathInfo.split("[.-]", versions.length + 1 );//
		System.out.println(pathComponents.length);
		//String[] pathComponents1 =Arrays.copyOfRange(pathComponents, 3, pathComponents.length);
		for(String str :pathComponents ){
			System.out.println("Element : "+str);
		}
		//String branchId =Joiner.on("/").join(Arrays.copyOfRange(pathComponents, 3, pathComponents.length));
		//System.out.println(branchId);
		String rest = "";
		 if (pathComponents.length > versions.length) {
	            rest = pathComponents[versions.length];
	        }
		List<Object> list = new LinkedList<>();
		for (int version : versions) {
            list.add(version);
        }
		list.add(rest);
		System.out.println("PluginVersion "+ list );
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("a", "A");
		System.out.println(hm);
		
		String exemptRepoSuffixes[] = "-graphics".split(","); //,-documentation
		 for (String repoSuffix : exemptRepoSuffixes) {
	            if ("abc-Graphics".endsWith(repoSuffix)) {
	                System.out.println("Exempted");
	                
	            }
	        }
		 
	
 */


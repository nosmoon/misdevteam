/***************************************************************************************************
* 파일명 : SSExtn4600WB.java
* 기능 : 기업후원확장-등록및조회
* 작성일자 : 2016-02-15
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.ss.sls.extn.wb;

import javax.ejb.*;
import java.util.*;				//추가
import java.lang.*;				//추가
import java.rmi.*;
import javax.servlet.http.*;

import somo.framework.lib.*;
import somo.framework.expt.*;
import somo.framework.log.*;
import somo.framework.expt.*;
import somo.framework.util.*;
import somo.framework.db.*;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.dao.*;

/**
 * WB
 */

public class SSExtn4600WB{

    /**
     * 초기화면
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     **/
    public void initExtn4600(HttpServletRequest req, HttpServletResponse res) throws AppException {

    	 SS_SLS_EXTN_4600_ADataSet ds = null;

         //request process
         //String bocd = Util.checkString(req.getParameter("bocd"));
         String emp_no = Util.getSessionParameterValue(req, "emp_no", true);
         String cmpycd = Util.getSessionParameterValue(req, "cmpycd", true);

         SS_SLS_EXTN_4600_ADM dm = new SS_SLS_EXTN_4600_ADM();
         //dm.setBocd(bocd);
         dm.setCmpy_cd(cmpycd);
         dm.setIncmg_pers(emp_no);

         SSExtn4600DAO dao = new SSExtn4600DAO();         
         ds = dao.initExtn4600(dm);
         req.setAttribute("ds", ds);

    }
    
    public void getUserInfo(HttpServletRequest req, HttpServletResponse res) throws AppException{ 
    	SS_SLS_EXTN_4601_LDataSet ds = null;
    	
    	String srch_word = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_word")));
    	
        // DM Setting
    	SS_SLS_EXTN_4601_LDM dm = new SS_SLS_EXTN_4601_LDM();
    	dm.setSrch_word(srch_word);

    	SSExtn4600DAO dao = new SSExtn4600DAO();
        // DAO 객체의 initApt 호출
        ds = dao.getUserInfo(dm);
        req.setAttribute("ds", ds);
    }
    
    public void getDncompInfo(HttpServletRequest req, HttpServletResponse res) throws AppException{ 
    	SS_SLS_EXTN_4602_LDataSet ds = null;
    	
    	String srch_word = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_word")));
    	
        // DM Setting
    	SS_SLS_EXTN_4602_LDM dm = new SS_SLS_EXTN_4602_LDM();
    	dm.setSrch_word(srch_word);

    	SSExtn4600DAO dao = new SSExtn4600DAO();
        // DAO 객체의 initApt 호출
        ds = dao.getDncompInfo(dm);
        req.setAttribute("ds", ds);
    }
    
    public void uploadExtn4610(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_4610_IDataSet ds = null;

        //request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   	 	String dncomp = Util.Uni2Ksc(Util.checkString(req.getParameter("dncomp")));
   	 	String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
   	 	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
   	 	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
   	 	String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
   	 	String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
   	 	String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
   	 	String refaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("refaddr")));
   	 	String telno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno1")));
   	 	String telno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno2")));
   		String telno3 = Util.Uni2Ksc(Util.checkString(req.getParameter("telno3")));
   		String ptphno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptphno1")));
   		String ptphno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptphno2")));
   		String ptphno3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptphno3")));
   		String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
   		String fr_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_yymm")));
   		String to_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("to_yymm")));
   		String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));
   		String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
   		String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn")));
   		String extngb = Util.Uni2Ksc(Util.checkString(req.getParameter("extngb")));
   		
        SS_SLS_EXTN_4610_IDM dm = new SS_SLS_EXTN_4610_IDM();
        dm.setIncmgpers(incmgpers);
        dm.setDncomp(dncomp);
        dm.setEmpseq(empseq);
        dm.setRdrnm(rdrnm);
        dm.setBocd(bocd);
        dm.setZip(zip);
        dm.setAddr(addr);
        dm.setDtlsaddr(dtlsaddr);
        dm.setRefaddr(refaddr);
        dm.setTelno1(telno1);
        dm.setTelno2(telno2);
        dm.setTelno3(telno3);
        dm.setPtphno1(ptphno1);
        dm.setPtphno2(ptphno2);
        dm.setPtphno3(ptphno3);
        dm.setQty(qty);
        dm.setFr_yymm(fr_yymm);
        dm.setTo_yymm(to_yymm);
        dm.setSubsuprc(subsuprc);
        dm.setRemk(remk);
        dm.setBldmngnn(bldmngnn);
        dm.setExtngb(extngb);
        
        dm.print();

        SSExtn4600DAO dao = new SSExtn4600DAO();         
        ds = dao.uploadExtn4610(dm);
        req.setAttribute("ds", ds);

    }
    
    public void selectExtn4620(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_4620_LDataSet ds = null;

        //request process
   	 	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
   	 	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
   	 	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
   	 	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
   	 	String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
   	 	String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
   	 	String extnnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnnm")));
   	 	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
   	 	String dncomp = Util.Uni2Ksc(Util.checkString(req.getParameter("dncomp")));
   	 	String extn_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_gbcd")));
   	 	   		
   		SS_SLS_EXTN_4620_LDM dm = new SS_SLS_EXTN_4620_LDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setExtnnm(extnnm);
        dm.setRdrnm(rdrnm);
        dm.setDncomp(dncomp);
        dm.setExtn_gb(extn_gb);
        
        dm.print();

        SSExtn4600DAO dao = new SSExtn4600DAO();         
        ds = dao.selectExtn4620(dm);
        req.setAttribute("ds", ds);
    }
    
    public final String ROW_SEPARATOR = "|";
    public final String COL_SEPARATOR = "#";
    
    public Hashtable getHashMultiUpdateData(String multiUpdateData) throws AppException {
      	Hashtable 	hash	= new Hashtable();
      	
      	try{
        	String[][] temp_arr = null;
        	
        	StringTokenizer st = new StringTokenizer(multiUpdateData, ROW_SEPARATOR);
        	
        	int rowCount  = 0;
        	int colCount  = st.countTokens();
        	int col = 0;
        	int row = 0;
        	while(st.hasMoreTokens()){
        		row = 0;
        		String token 	 	= st.nextToken();
        		String[] token_arr 	= token.split(COL_SEPARATOR);
        		if(temp_arr == null){
        			rowCount = token_arr.length;
        			temp_arr = new String[rowCount][colCount];
        		}
        		for(int i=0; i<token_arr.length; i++){
        			temp_arr[row++][col] = token_arr[i];
        		}
        		col++;
        	}
        	for(int i=0; i<temp_arr.length; i++){
        		StringBuffer sb = new StringBuffer();
        		String header   = temp_arr[i][0];
        		for(int j=1; j<temp_arr[i].length; j++){
        			sb.append(StringUtil.nvl(temp_arr[i][j]));
        			if(j<temp_arr[i].length-1){
        				sb.append(COL_SEPARATOR);
        			}
        		}        		
        		hash.put(header, sb.toString());
        	}        	
      	}catch(Exception e){
      		throw new AppException("BaseWB.getHashMultiUpdateData", e.getLocalizedMessage()+ multiUpdateData);
      	}
      	return hash;   
    }
    
    public void saveExtn4630(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_4630_UDataSet ds = null;

    	//request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   		
   		String multiUpdateData 		= Util.checkString(req.getParameter("multiUpDate1"));
   		System.out.println("multiUpdateData:"+multiUpdateData);
   		
   		SS_SLS_EXTN_4630_UDM dm = new SS_SLS_EXTN_4630_UDM();
    	
   		dm.setIncmgpers			(incmgpers			);
   		
    	Hashtable hash				= new Hashtable();
    	if ( !"".equals(multiUpdateData) ){  	
  	    	hash 					= getHashMultiUpdateData(multiUpdateData);
  	    	             
  	    	String mode				= Util.checkString((String) hash.get("m"         ));           
  	    	String dncomp			= Util.checkString((String) hash.get("dncomp"         ));
  	    	String empseq			= Util.checkString((String) hash.get("empseq"        ));
  	    	String rdrnm			= Util.checkString((String) hash.get("rdrnm"        ));
  	    	String bocd				= Util.checkString((String) hash.get("bocd"        ));
  	    	String zip				= Util.checkString((String) hash.get("zip"        ));
  	    	String addr				= Util.checkString((String) hash.get("addr"        ));
  	    	String dtlsaddr			= Util.checkString((String) hash.get("dtlsaddr"        ));
  	    	String refaddr			= Util.checkString((String) hash.get("refaddr"        ));
  	    	String telno1			= Util.checkString((String) hash.get("telno1"        ));
  	    	String telno2			= Util.checkString((String) hash.get("telno2"        ));
  	    	String telno3			= Util.checkString((String) hash.get("telno3"        ));
  	    	String ptphno1			= Util.checkString((String) hash.get("ptphno1"        ));
  	    	String ptphno2			= Util.checkString((String) hash.get("ptphno2"        ));
  	    	String ptphno3			= Util.checkString((String) hash.get("ptphno3"        ));
  	    	String qty				= Util.checkString((String) hash.get("qty"        ));
  	    	String fr_yymm			= Util.checkString((String) hash.get("fr_yymm"        ));
  	    	String to_yymm			= Util.checkString((String) hash.get("to_yymm"        ));
  	    	String subsuprc			= Util.checkString((String) hash.get("subsuprc"        ));
  	    	String remk				= Util.checkString((String) hash.get("remk"        ));
  	    	String bldmngnn			= Util.checkString((String) hash.get("bldmngnn"        ));
  	    	String extngb			= Util.checkString((String) hash.get("extngb"        ));
  	    	String aplcdt			= Util.checkString((String) hash.get("aplcdt"        ));
  	    	String aplcno			= Util.checkString((String) hash.get("aplcno"        ));

  	    	dm.setMode(mode);
  	    	dm.setDncomp(dncomp);
  	        dm.setEmpseq(empseq);
  	        dm.setRdrnm(rdrnm);
  	        dm.setBocd(bocd);
  	        dm.setZip(zip);
  	        dm.setAddr(addr);
  	        dm.setDtlsaddr(dtlsaddr);
  	        dm.setRefaddr(refaddr);
  	        dm.setTelno1(telno1);
  	        dm.setTelno2(telno2);
  	        dm.setTelno3(telno3);
  	        dm.setPtphno1(ptphno1);
  	        dm.setPtphno2(ptphno2);
  	        dm.setPtphno3(ptphno3);
  	        dm.setQty(qty);
  	        dm.setFr_yymm(fr_yymm);
  	        dm.setTo_yymm(to_yymm);
  	        dm.setSubsuprc(subsuprc);
  	        dm.setRemk(remk);
  	        dm.setBldmngnn(bldmngnn);
  	        dm.setExtngb(extngb);  
  	        dm.setAplcdt(aplcdt);
  	        dm.setAplcno(aplcno);
  	    }  	 
   	        
        dm.print();

        SSExtn4600DAO dao = new SSExtn4600DAO();         
        ds = dao.saveExtn4630(dm);
        req.setAttribute("ds", ds);
    }
    
    public void closExtn4640(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_4640_UDataSet ds = null;

        //request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   	 	
   		String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
   		String aplcno = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcno")));
   		   		   		
   		SS_SLS_EXTN_4640_UDM dm = new SS_SLS_EXTN_4640_UDM();
        
        dm.setIncmgpers(incmgpers);
        dm.setAplcdt(aplcdt);
        dm.setAplcno(aplcno);
        
        dm.print();

        SSExtn4600DAO dao = new SSExtn4600DAO();         
        ds = dao.closExtn4640(dm);
        req.setAttribute("ds", ds);
    }
    
    public void selectExtn4650(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_4650_LDataSet ds = null;

        //request process
   	 	String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
   	 	String partcd = Util.Uni2Ksc(Util.checkString(req.getParameter("partcd")));
   	 	String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
   	 	String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
   	 	String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
   	 	String fromdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fromdt")));
   	 	String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
   	 	String extnnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnnm")));
   	 	String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
   	 	String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
   	 	String dncomp = Util.Uni2Ksc(Util.checkString(req.getParameter("dncomp")));
   	 	String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
   	 	String bo_headcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_headcnfmyn")));
   	 	String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
   	 	String subsyn = Util.Uni2Ksc(Util.checkString(req.getParameter("subsyn")));
   	 	String extn_gb = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_gbcd")));
   	 	String dn_fr_yymm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_fr_yymm1")));
   	 	String dn_fr_yymm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_fr_yymm2")));
   	 	String dn_to_yymm1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_to_yymm1")));
   	 	String dn_to_yymm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("dn_to_yymm2")));
   	 	   		
   		SS_SLS_EXTN_4650_LDM dm = new SS_SLS_EXTN_4650_LDM();
        dm.setDeptcd(deptcd);
        dm.setPartcd(partcd);
        dm.setAreacd(areacd);
        dm.setBocd(bocd);
        dm.setFromtogb(fromtogb);
        dm.setFromdt(fromdt);
        dm.setTodt(todt);
        dm.setExtnnm(extnnm);
        dm.setRdrnm(rdrnm);
        dm.setRdr_extntypecd(rdr_extntypecd);
        dm.setDncomp(dncomp);
        dm.setMedicd(medicd);        
        dm.setBo_headcnfmyn(bo_headcnfmyn);
        dm.setSubscnfmstatcd(subscnfmstatcd);
        dm.setSubsyn(subsyn);
        dm.setExtn_gb(extn_gb);
        dm.setDn_fr_yymm1(dn_fr_yymm1);
        dm.setDn_fr_yymm2(dn_fr_yymm2);
        dm.setDn_to_yymm1(dn_to_yymm1);
        dm.setDn_to_yymm2(dn_to_yymm2);
        
        dm.print();

        SSExtn4600DAO dao = new SSExtn4600DAO();         
        ds = dao.selectExtn4650(dm);
        req.setAttribute("ds", ds);
    }
    
    public void stopExtn4660(HttpServletRequest req, HttpServletResponse res) throws AppException {

   	 	SS_SLS_EXTN_4660_UDataSet ds = null;

        //request process
   	 	String incmgpers = Util.getSessionParameterValue(req, "uid", true);   //입력자 아이디
   	 	
   		String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
   		
   		SS_SLS_EXTN_4660_UDM dm = new SS_SLS_EXTN_4660_UDM();
        
        dm.setIncmgpers(incmgpers);
        dm.setRdr_no(rdr_no);
        
        dm.print();

        SSExtn4600DAO dao = new SSExtn4600DAO();         
        ds = dao.stopExtn4660(dm);
        req.setAttribute("ds", ds);
    }
}    
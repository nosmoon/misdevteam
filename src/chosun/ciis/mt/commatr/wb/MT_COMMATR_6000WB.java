/***************************************************************************************************
* 파일명 : MT_REPORT_6000WB.java
* 기능 :  자재 - 장표 - 장표환경설정 
 * 작성일자 : 2012.06.20
 * 작성자 :   김성미
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.mt.commatr.wb;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.db.DBManager;
import somo.framework.expt.AppException;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.ad.bas.dao.AdBas1500DAO;
import chosun.ciis.ad.bas.dm.AD_BAS_1590_ADM;
import chosun.ciis.ad.bas.ds.AD_BAS_1590_ADataSet;
import chosun.ciis.ad.common.wb.AttachFileVO;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.co.base.wb.BaseWB;
import chosun.ciis.mt.commatr.dao.MT_COMMATR_6000DAO;
import chosun.ciis.mt.commatr.dao.MT_COMMATR_7000DAO;
import chosun.ciis.mt.commatr.dm.*;
//import chosun.ciis.mt.commatr.dm.MT_COMMATR_6000_MDM;
//import chosun.ciis.mt.commatr.dm.MT_COMMATR_6010_LDM;
//import chosun.ciis.mt.commatr.dm.MT_COMMATR_6110_LDM;
//import chosun.ciis.mt.commatr.dm.MT_COMMATR_6210_LDM;
//import chosun.ciis.mt.commatr.dm.MT_COMMATR_6020_ADM;
//import chosun.ciis.mt.commatr.dm.MT_COMMATR_6120_SDM;
//import chosun.ciis.mt.commatr.dm.MT_COMMATR_7110_LDM;
import chosun.ciis.mt.commatr.ds.*;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_6000_MDataSet;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_6010_LDataSet;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_6110_LDataSet;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_6210_LDataSet;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_6020_ADataSet;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_6120_SDataSet;
//import chosun.ciis.mt.commatr.ds.MT_COMMATR_7110_LDataSet;

/**
 * 
 */ 

public class MT_COMMATR_6000WB extends BaseWB{

    /**
     * 담당자 구분과 담당부서코드 목록을 조회한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void mt_commatr_6000_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        MT_COMMATR_6000_MDataSet ds = null;
 
        // DM Setting
        MT_COMMATR_6000_MDM dm = new MT_COMMATR_6000_MDM();
        
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);//Util.checkString(req.getParameter("team_cd"));
        String u_id = Util.getSessionParameterValue(req, "uid", true);
        String dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.setCmpy_cd(cmpy_cd);
        dm.setU_id(u_id);
        dm.setDept_cd(dept_cd);
        //dm.print();
        
        try { 
        	MT_COMMATR_6000DAO dao = new MT_COMMATR_6000DAO();
            ds = dao.mt_commatr_6000_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    
    public void mt_commatr_6010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_6010_LDataSet ds = null;
		MT_COMMATR_6010_LDM dm = new MT_COMMATR_6010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_no = Util.checkString(req.getParameter("dept_no"));
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.patr_chrg_pers = Util.checkString(req.getParameter("patr_chrg_pers"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.tag = Util.checkString(req.getParameter("tag"));
		dm.search_opt = Util.checkString(req.getParameter("search_opt"));
		dm.list_grd = Util.checkString(req.getParameter("list_grd"));
		dm.print();

		try {
        	MT_COMMATR_6000DAO dao = new MT_COMMATR_6000DAO();
            ds = dao.mt_commatr_6010_l(dm);  
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
		

		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dept_no = (String)hash.get("dept_no");
		dm.search_dt_fr = (String)hash.get("search_dt_fr");
		dm.search_dt_to = (String)hash.get("search_dt_to");
		dm.dlco_clsf = (String)hash.get("dlco_clsf");
		dm.patr_chrg_pers = (String)hash.get("patr_chrg_pers");
		dm.chrg_pers = (String)hash.get("chrg_pers");
		dm.search_wd = (String)hash.get("search_wd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_no = Util.getSessionParameterValue(req,"dept_no",true);
		dm.search_dt_fr = Util.getSessionParameterValue(req,"search_dt_fr",true);
		dm.search_dt_to = Util.getSessionParameterValue(req,"search_dt_to",true);
		dm.dlco_clsf = Util.getSessionParameterValue(req,"dlco_clsf",true);
		dm.patr_chrg_pers = Util.getSessionParameterValue(req,"patr_chrg_pers",true);
		dm.chrg_pers = Util.getSessionParameterValue(req,"chrg_pers",true);
		dm.search_wd = Util.getSessionParameterValue(req,"search_wd",true);
		*******************************************************************************************/
	}
   
    public void mt_commatr_6020_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_6020_ADataSet ds = null;
		MT_COMMATR_6020_ADM dm = new MT_COMMATR_6020_ADM();
		
		dm.cmpy_cd 		= Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt 		= Util.checkString(req.getParameter("occr_dt"));
		dm.seq 			= Util.checkString(req.getParameter("seq"));
		dm.dept_cd 		= Util.checkString(req.getParameter("dept_cd"));
		dm.dlco_clsf 	= Util.checkString(req.getParameter("dlco_clsf"));
		dm.dlco_no		= Util.checkString(req.getParameter("dlco_no"));
		dm.chrg_pers 	= Util.getSessionParameterValue(req,"emp_no",true);
		dm.patr_chrg_pers = Util.checkString(req.getParameter("patr_chrg_pers"));
		dm.titl 		= Util.checkString(req.getParameter("titl"));
		dm.cont 		= StringUtil.replaceToXml(Util.checkString(req.getParameter("cont")));
		dm.tag 			= Util.checkString(req.getParameter("tag"));
//		dm.titl 		= req.getParameter("titl").trim();
//		dm.cont 		= StringUtil.replaceToXml(req.getParameter("cont"));
//		dm.tag 			= req.getParameter("tag").trim();
		
		dm.team_chf_yn 	= Util.checkString(req.getParameter("team_chf_yn"));
		dm.incmg_pers 	= Util.getSessionParameterValue(req,"emp_no",true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.flag			= Util.checkString(req.getParameter("flag"));
		
		String add_file_nm1  	= Util.checkString(req.getParameter("add_file_nm1"));
		String add_file_nm2  	= Util.checkString(req.getParameter("add_file_nm2"));
		String add_file_nm3  	= Util.checkString(req.getParameter("add_file_nm3"));
		String add_file_nm4  	= Util.checkString(req.getParameter("add_file_nm4"));
		String add_file_nm5  	= Util.checkString(req.getParameter("add_file_nm5"));
		String add_file_nm6  	= Util.checkString(req.getParameter("add_file_nm6"));
		String add_file_nm7  	= Util.checkString(req.getParameter("add_file_nm7"));
		String add_file_nm8  	= Util.checkString(req.getParameter("add_file_nm8"));
		String add_file_nm9  	= Util.checkString(req.getParameter("add_file_nm9"));
		String add_file_nm10  	= Util.checkString(req.getParameter("add_file_nm10"));
		String add_file_no1  	= Util.checkString(req.getParameter("add_file_no1"));
		String add_file_no2  	= Util.checkString(req.getParameter("add_file_no2"));
		String add_file_no3  	= Util.checkString(req.getParameter("add_file_no3"));
		String add_file_no4  	= Util.checkString(req.getParameter("add_file_no4"));
		String add_file_no5  	= Util.checkString(req.getParameter("add_file_no5"));
		String add_file_no6  	= Util.checkString(req.getParameter("add_file_no6"));
		String add_file_no7  	= Util.checkString(req.getParameter("add_file_no7"));
		String add_file_no8  	= Util.checkString(req.getParameter("add_file_no8"));
		String add_file_no9  	= Util.checkString(req.getParameter("add_file_no9"));
		String add_file_no10  	= Util.checkString(req.getParameter("add_file_no10"));
		String file_delyn1    	= Util.checkString(req.getParameter("file_delyn1"));
		String file_delyn2    	= Util.checkString(req.getParameter("file_delyn2"));
		String file_delyn3    	= Util.checkString(req.getParameter("file_delyn3"));
		String file_delyn4    	= Util.checkString(req.getParameter("file_delyn4"));
		String file_delyn5    	= Util.checkString(req.getParameter("file_delyn5"));
		String file_delyn6    	= Util.checkString(req.getParameter("file_delyn6"));
		String file_delyn7    	= Util.checkString(req.getParameter("file_delyn7"));
		String file_delyn8    	= Util.checkString(req.getParameter("file_delyn8"));
		String file_delyn9    	= Util.checkString(req.getParameter("file_delyn9"));
		String file_delyn10    	= Util.checkString(req.getParameter("file_delyn10"));
		
		if (file_delyn1.equals("")){ file_delyn1 = "N"; }
		if (file_delyn2.equals("")){ file_delyn2 = "N"; }
    	if (file_delyn3.equals("")){ file_delyn3 = "N"; }
    	if (file_delyn4.equals("")){ file_delyn4 = "N"; }
    	if (file_delyn5.equals("")){ file_delyn5 = "N"; }
		if (file_delyn6.equals("")){ file_delyn6 = "N"; }
		if (file_delyn7.equals("")){ file_delyn7 = "N"; }
    	if (file_delyn8.equals("")){ file_delyn8 = "N"; }
    	if (file_delyn9.equals("")){ file_delyn9 = "N"; }
    	if (file_delyn10.equals("")){ file_delyn10 = "N"; }
    	
        
        String flag       	 	= Util.checkString(req.getParameter("flag"));
		ArrayList attcFiles 	= (ArrayList)req.getAttribute("ATTACH_FILES");
		
		if (!"F".equals(flag) && !"D".equals(flag) && ("N".equals(file_delyn1) || "N".equals(file_delyn2) || "N".equals(file_delyn3) || "N".equals(file_delyn4) || "N".equals(file_delyn5) || "N".equals(file_delyn6) || "N".equals(file_delyn7) || "N".equals(file_delyn8) || "N".equals(file_delyn9) || "N".equals(file_delyn10))){  
			if(attcFiles != null){
			
		        for(int i=0; i<attcFiles.size(); i++){
		        	AttachFileVO attachFileVO = (AttachFileVO)attcFiles.get(i);
		        	
		        	if(i==0){			//1번째 첨부
		        		dm.setAdd_file_nm1(attachFileVO.getAttcFilNm());
			            dm.setAdd_file1(attachFileVO.getAttcFilCont());
			            if (!flag.equals("I") && !add_file_no1.equals("") && (!add_file_nm1.equals("@"))) {
			            	dm.setAdd_file_no1(add_file_no1);
			            }
		        	}else if(i==1){		//2번째 첨부
			        	dm.setAdd_file_nm2(attachFileVO.getAttcFilNm());
			          	dm.setAdd_file2(attachFileVO.getAttcFilCont());
			          	if (!flag.equals("I") && !add_file_no2.equals("") && (!add_file_nm2.equals("@"))) {
			            	dm.setAdd_file_no2(add_file_no2);
			            }
		        	}else if(i==2){		//3번째 첨부
			        	dm.setAdd_file_nm3(attachFileVO.getAttcFilNm());
			        	dm.setAdd_file3(attachFileVO.getAttcFilCont());                
			        	if (!flag.equals("I") && !add_file_no3.equals("") && (!add_file_nm3.equals("@"))) {
			        		dm.setAdd_file_no3(add_file_no3);
			         	}
		        	}else if(i==3){		//4번째 첨부
			        	dm.setAdd_file_nm4(attachFileVO.getAttcFilNm());
			        	dm.setAdd_file4(attachFileVO.getAttcFilCont());
			        	if (!flag.equals("I") && !add_file_no4.equals("") && (!add_file_nm4.equals("@"))) {
			        		dm.setAdd_file_no4(add_file_no4);
			         	}
		        	}else if(i==4){		//5번째 첨부
		        		dm.setAdd_file_nm5(attachFileVO.getAttcFilNm());
		        		dm.setAdd_file5(attachFileVO.getAttcFilCont());
		        		if (!flag.equals("I") && !add_file_no5.equals("") && (!add_file_nm5.equals("@"))) {
		        			dm.setAdd_file_no5(add_file_no5);
			        	}
		        	}else if(i==5){		//5번째 첨부
		        		dm.setAdd_file_nm6(attachFileVO.getAttcFilNm());
		        		dm.setAdd_file6(attachFileVO.getAttcFilCont());
		        		if (!flag.equals("I") && !add_file_no6.equals("") && (!add_file_nm6.equals("@"))) {
		        			dm.setAdd_file_no6(add_file_no6);
			        	}
		        	}else if(i==6){		//7번째 첨부
		        		dm.setAdd_file_nm7(attachFileVO.getAttcFilNm());
		        		dm.setAdd_file7(attachFileVO.getAttcFilCont());
		        		if (!flag.equals("I") && !add_file_no7.equals("") && (!add_file_nm7.equals("@"))) {
		        			dm.setAdd_file_no7(add_file_no7);
			        	}
		        	}else if(i==7){		//8번째 첨부
		        		dm.setAdd_file_nm8(attachFileVO.getAttcFilNm());
		        		dm.setAdd_file8(attachFileVO.getAttcFilCont());
		        		if (!flag.equals("I") && !add_file_no8.equals("") && (!add_file_nm8.equals("@"))) {
		        			dm.setAdd_file_no8(add_file_no8);
			        	}
		        	}else if(i==8){		//5번째 첨부
		        		dm.setAdd_file_nm9(attachFileVO.getAttcFilNm());
		        		dm.setAdd_file9(attachFileVO.getAttcFilCont());
		        		if (!flag.equals("I") && !add_file_no9.equals("") && (!add_file_nm9.equals("@"))) {
		        			dm.setAdd_file_no9(add_file_no9);
			        	}
		        	}else if(i==9){		//5번째 첨부
		        		dm.setAdd_file_nm10(attachFileVO.getAttcFilNm());
		        		dm.setAdd_file10(attachFileVO.getAttcFilCont());
		        		if (!flag.equals("I") && !add_file_no10.equals("") && (!add_file_nm10.equals("@"))) {
		        			dm.setAdd_file_no10(add_file_no10);
			        	}
		        	}
		        	
		        }    
	    	}

        }
		if ("F".equals(flag)){
			dm.setAdd_file_no1(add_file_no1);
			dm.setAdd_file_no2(add_file_no2);
			dm.setAdd_file_no3(add_file_no3);
			dm.setAdd_file_no4(add_file_no4);
			dm.setAdd_file_no5(add_file_no5);    
			dm.setAdd_file_no6(add_file_no6);
			dm.setAdd_file_no7(add_file_no7);
			dm.setAdd_file_no8(add_file_no8);
			dm.setAdd_file_no9(add_file_no9);
			dm.setAdd_file_no10(add_file_no10);
			dm.setAdd_file_nm1(add_file_nm1);
			dm.setAdd_file_nm2(add_file_nm2);
			dm.setAdd_file_nm3(add_file_nm3);
			dm.setAdd_file_nm4(add_file_nm4);
			dm.setAdd_file_nm5(add_file_nm5);    
			dm.setAdd_file_nm6(add_file_nm6);
			dm.setAdd_file_nm7(add_file_nm7);
			dm.setAdd_file_nm8(add_file_nm8);
			dm.setAdd_file_nm9(add_file_nm9);
			dm.setAdd_file_nm10(add_file_nm10);
		}
		dm.setFile_delyn1(file_delyn1);
        dm.setFile_delyn2(file_delyn2);
        dm.setFile_delyn3(file_delyn3);
        dm.setFile_delyn4(file_delyn4);
        dm.setFile_delyn5(file_delyn5);    
        dm.setFile_delyn6(file_delyn6);
        dm.setFile_delyn7(file_delyn7);
        dm.setFile_delyn8(file_delyn8);
        dm.setFile_delyn9(file_delyn9);
        dm.setFile_delyn10(file_delyn10);
    	
		dm.print();
		try {
        	MT_COMMATR_6000DAO dao = new MT_COMMATR_6000DAO();
        	ds = dao.mt_commatr_6020_a(dm);
            req.setAttribute("ds", ds);
            
        }
		catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

		
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.seq = (String)hash.get("seq");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dlco_clsf = (String)hash.get("dlco_clsf");
		dm.dlco_no = (String)hash.get("dlco_no");
		dm.chrg_pers = (String)hash.get("chrg_pers");
		dm.patr_chrg_pers = (String)hash.get("patr_chrg_pers");
		dm.titl = (String)hash.get("titl");
		dm.cont = (String)hash.get("cont");
		dm.tag = (String)hash.get("tag");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.incmg_pers_ip = (String)hash.get("incmg_pers_ip");
		dm.flag = (String)hash.get("flag");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.seq = Util.getSessionParameterValue(req,"seq",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.dlco_clsf = Util.getSessionParameterValue(req,"dlco_clsf",true);
		dm.dlco_no = Util.getSessionParameterValue(req,"dlco_no",true);
		dm.chrg_pers = Util.getSessionParameterValue(req,"chrg_pers",true);
		dm.patr_chrg_pers = Util.getSessionParameterValue(req,"patr_chrg_pers",true);
		dm.titl = Util.getSessionParameterValue(req,"titl",true);
		dm.cont = Util.getSessionParameterValue(req,"cont",true);
		dm.tag = Util.getSessionParameterValue(req,"tag",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.incmg_pers_ip = Util.getSessionParameterValue(req,"incmg_pers_ip",true);
		dm.flag = Util.getSessionParameterValue(req,"flag",true);
		*******************************************************************************************/
	}
    public void mt_commatr_6110_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_6110_LDataSet ds = null;
		MT_COMMATR_6110_LDM dm = new MT_COMMATR_6110_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();

		try {
			MT_COMMATR_6000DAO dao = new MT_COMMATR_6000DAO();
        	ds = dao.mt_commatr_6110_l(dm);  
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
		

	
	}
    
    public void mt_commatr_6120_s(HttpServletRequest req, HttpServletResponse res) throws   AppException {

    	MT_COMMATR_6120_SDataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String occr_dt = Util.checkString(req.getParameter("occr_dt"));
    	String seq = Util.checkString(req.getParameter("seq"));
    	String add_file_gb = Util.checkString(req.getParameter("add_file_gb"));
    	String add_file_no = Util.checkString(req.getParameter("add_file_no"));
        // DM Setting
    	MT_COMMATR_6120_SDM dm = new MT_COMMATR_6120_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOccr_dt(occr_dt);
    	dm.setSeq(seq);
    	dm.setAdd_file_gb(add_file_gb);
    	dm.setAdd_file_no(add_file_no);
    	
    	dm.print();
    	
        try {
        	MT_COMMATR_6000DAO dao = new MT_COMMATR_6000DAO();
            ds = dao.mt_commatr_6120_s(dm);
            req.setAttribute("ds", ds);
	        req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
	        req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.  
	        
        }  
        catch (AppException e) {
            throw e;
        }   	
  
    } 
    
    public void mt_commatr_6210_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		MT_COMMATR_6210_LDataSet ds = null;
		MT_COMMATR_6210_LDM dm = new MT_COMMATR_6210_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.add_file_no = Util.checkString(req.getParameter("add_file_no"));
		dm.print();

		try {
			MT_COMMATR_6000DAO dao = new MT_COMMATR_6000DAO();
			ds = dao.mt_commatr_6210_l(dm);
        	req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	
	}
    
    
    public void mt_commatr_6510_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_COMMATR_6510_LDataSet ds = null;
		
    	MT_COMMATR_6510_LDM dm = new MT_COMMATR_6510_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_yy_fr = Util.checkString(req.getParameter("issu_yy_fr"));
		dm.issu_yy_to = Util.checkString(req.getParameter("issu_yy_to"));
		dm.search_gubun = Util.checkString(req.getParameter("search_gubun"));
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_COMMATR_6510_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
    
    public void mt_commatr_6520_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_COMMATR_6520_LDataSet ds = null;
		
    	MT_COMMATR_6520_LDM dm = new MT_COMMATR_6520_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_yymm_fr = Util.checkString(req.getParameter("issu_yymm_fr"));
		dm.issu_yymm_to = Util.checkString(req.getParameter("issu_yymm_to"));
		dm.comp_yymm_fr = Util.checkString(req.getParameter("comp_yymm_fr"));
		dm.comp_yymm_to = Util.checkString(req.getParameter("comp_yymm_to"));
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_COMMATR_6520_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
    
    
    public void mt_commatr_6500_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        MT_COMMATR_6500_MDataSet ds = null;
 
        // DM Setting
        MT_COMMATR_6500_MDM dm = new MT_COMMATR_6500_MDM();
        
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);//Util.checkString(req.getParameter("team_cd"));
        dm.setCmpy_cd(cmpy_cd);
        
        //dm.print();
        DBManager manager = new DBManager("MISMAT");
        
        ds = (MT_COMMATR_6500_MDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
        
    }
    public void mt_commatr_6610_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	MT_COMMATR_6610_LDataSet ds = null;
		
    	MT_COMMATR_6610_LDM dm = new MT_COMMATR_6610_LDM();
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.issu_yymm_fr = Util.checkString(req.getParameter("issu_yymm_fr"));
		dm.issu_yymm_to = Util.checkString(req.getParameter("issu_yymm_to"));
		dm.issu_yy = Util.checkString(req.getParameter("issu_yy"));
		//dm.search_gubun = Util.checkString(req.getParameter("search_gubun"));
		dm.print();
		DBManager manager = new DBManager("MISMAT");
		
		ds = (MT_COMMATR_6610_LDataSet)manager.executeCall(dm);
		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}
		
		req.setAttribute("ds", ds);
		
	}
    /**
     * 검색조건에 맞는 담당자 이력 리스트 가져오기 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    
    
    /*
    public void se_bas_1210_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
        SE_BAS_1210_LDataSet ds = null;

        // DM Setting
        SE_BAS_1210_LDM dm 	= new SE_BAS_1210_LDM();

        String cmpy_cd		= Util.getSessionParameterValue(req, "cmpycd", true); //Util.checkString(req.getParameter("cmpy_cd"));
        String aply_yymm_fr = Util.checkString(req.getParameter("aply_yymm_fr"));
        String aply_yymm_to = Util.checkString(req.getParameter("aply_yymm_to"));
        String medi_cd = Util.checkString(req.getParameter("medi_cd"));
        String sell_net_clsf = Util.checkString(req.getParameter("sell_net_clsf"));

        dm.setCmpy_cd(cmpy_cd);
        dm.setAply_yymm_fr(aply_yymm_fr);
        dm.setAply_yymm_to(aply_yymm_to);
        dm.setMedi_cd(medi_cd);
        dm.setSell_net_clsf(sell_net_clsf);
        
        
        try {
        	SE_BAS_1200DAO dao = new SE_BAS_1200DAO();
            ds = dao.se_bas_1210_l(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        SE_BAS_1200EJBHome home = (SE_BAS_1200EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1200EJB");
//        
//        try {
//        	SE_BAS_1200EJB ejb = home.create();
//            System.out.println("1111111111111111111111::::::::::");
//            ds = ejb.se_bas_1210_l(dm);
//            System.out.println("2222222222222222222222::::::::::");
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            System.out.println("errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            System.out.println("remote errrrrrrr>>>>>>>>>>>>>>>"+ds.getErrmsg());
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    */
    /**
     * 담당자를 등록, 수정, 삭제한다. 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
/*
    public void se_bas_1220_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	SE_BAS_1220_ADataSet ds = null;

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpDate"));

        System.out.println("multiUpdateData: " + multiUpdateData);
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	System.out.println("11111111111111111111111");
    	String mode_ar = (String)hash.get("m"); 
    	System.out.println("2222222222222222222222");
		String aply_yymm_ar = (String)hash.get("aply_yymm");
		System.out.println("333333333333333333333");
		String medi_cd_ar = (String)hash.get("medi_cd");
		System.out.println("44444444444444444444444444");
		String sell_net_clsf_ar = (String)hash.get("sell_net_clsf");
		System.out.println("55555555555555555555555");
		String uprc_amt_ar = (String)hash.get("uprc_amt");
		System.out.println("6666666666666666666666");
		String uprc_aply_clsf_ar = (String)hash.get("uprc_aply_clsf");
		System.out.println("777777777777777777777");
		String remk_ar = (String)hash.get("remk");
		System.out.println("8888888888888888888888");
		
        String cmpy_cd          = Util.getSessionParameterValue(req, "cmpycd", true);
        String incmg_pers_ip    = req.getRemoteAddr();
        String incmg_pers		= Util.getSessionParameterValue(req, "uid", true);
        
        //DM Setting
        SE_BAS_1220_ADM dm = new SE_BAS_1220_ADM();

        dm.setCmpy_cd(cmpy_cd);
        dm.setMode(mode_ar.toUpperCase());
        dm.setAply_yymm(aply_yymm_ar);
        dm.setMedi_cd(medi_cd_ar);
        dm.setSell_net_clsf(sell_net_clsf_ar);
        dm.setUprc_amt(uprc_amt_ar);
        dm.setUprc_aply_clsf(uprc_aply_clsf_ar);
        dm.setRemk(remk_ar);
        dm.setIncmg_pers_ip(incmg_pers_ip);
        dm.setIncmg_pers(incmg_pers);
        
        try {
        	SE_BAS_1200DAO dao = new SE_BAS_1200DAO();
            ds = dao.se_bas_1220_a(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

//        dm.print();
        
//        SE_BAS_1200EJBHome home = (SE_BAS_1200EJBHome) JNDIManager.getInstance().getHome("SE_BAS_1200EJB");
//        
//        try {
//        	SE_BAS_1200EJB ejb = home.create();
//            ds = ejb.se_bas_1220_a(dm);
//            req.setAttribute("ds", ds);
//        }
//        catch (CreateException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
//        catch (RemoteException e) {
//            SysException se = new SysException(e);
//            LogManager.getInstance().log(se);
//            throw se;
//        }
    }
    */
}

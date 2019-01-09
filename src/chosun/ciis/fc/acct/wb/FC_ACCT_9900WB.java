package chosun.ciis.fc.acct.wb;

import java.rmi.*;
import java.sql.SQLException;
import java.util.*;

import javax.ejb.*;
import javax.servlet.http.*;

import somo.framework.db.DBManager;
import somo.framework.expt.*;
import somo.framework.lib.*;
import somo.framework.log.*;
import somo.framework.util.*;

import chosun.ciis.ad.common.wb.AttachFileVO;
import chosun.ciis.co.base.util.StringUtil;
import chosun.ciis.fc.acct.dao.FC_ACCT_9900DAO;
import chosun.ciis.fc.acct.dm.FC_ACCT_9900_MDM;
import chosun.ciis.fc.acct.dm.FC_ACCT_9910_LDM;
import chosun.ciis.fc.acct.dm.FC_ACCT_9920_ADM;
import chosun.ciis.fc.acct.dm.FC_ACCT_9930_LDM;
import chosun.ciis.fc.acct.dm.FC_ACCT_9931_SDM;
import chosun.ciis.fc.acct.dm.FC_ACCT_9940_LDM;
import chosun.ciis.fc.acct.ds.FC_ACCT_9900_MDataSet;
import chosun.ciis.fc.acct.ds.FC_ACCT_9910_LDataSet;
import chosun.ciis.fc.acct.ds.FC_ACCT_9920_ADataSet;
import chosun.ciis.fc.acct.ds.FC_ACCT_9930_LDataSet; 
import chosun.ciis.fc.acct.ds.FC_ACCT_9931_SDataSet;
import chosun.ciis.fc.acct.ds.FC_ACCT_9940_LDataSet;

public class FC_ACCT_9900WB extends chosun.ciis.co.base.wb.BaseWB {
    public void fc_acct_9900_m(HttpServletRequest req, HttpServletResponse res) throws   AppException, SQLException {
    	
        FC_ACCT_9900_MDataSet ds = null;
 
        // DM Setting
        FC_ACCT_9900_MDM dm = new FC_ACCT_9900_MDM();
        
        String cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);//Util.checkString(req.getParameter("team_cd"));
        String u_id = Util.getSessionParameterValue(req, "uid", true);
        String dept_cd = Util.checkString(req.getParameter("dept_cd"));
        dm.setCmpy_cd(cmpy_cd);
        dm.setU_id(u_id);
        dm.setDept_cd(dept_cd);
        //dm.print();
        
        try { 
        	FC_ACCT_9900DAO dao = new FC_ACCT_9900DAO();
            ds = dao.fc_acct_9900_m(dm);
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
    }
    
    public void fc_acct_9910_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_9910_LDataSet ds = null;
		FC_ACCT_9910_LDM dm = new FC_ACCT_9910_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_no = Util.checkString(req.getParameter("dept_no"));
		dm.search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
		dm.search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
		dm.dlco_clsf = Util.checkString(req.getParameter("dlco_clsf"));
		dm.dlco_no = Util.checkString(req.getParameter("dlco_no"));
		dm.patr_chrg_pers = Util.checkString(req.getParameter("patr_chrg_pers"));
		dm.chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
		dm.search_opt = Util.checkString(req.getParameter("search_opt"));
		dm.list_grd = Util.checkString(req.getParameter("list_grd"));
		dm.print();

		try {
        	FC_ACCT_9900DAO dao = new FC_ACCT_9900DAO();
            ds = dao.fc_acct_9910_l(dm);  
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

	}
   
    public void fc_acct_9920_a(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_9920_ADataSet ds = null;
		FC_ACCT_9920_ADM dm = new FC_ACCT_9920_ADM();
		
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
        	FC_ACCT_9900DAO dao = new FC_ACCT_9900DAO();
        	ds = dao.fc_acct_9920_a(dm);
            req.setAttribute("ds", ds);
            
        }
		catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }

	}
    public void fc_acct_9930_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_9930_LDataSet ds = null;
		FC_ACCT_9930_LDM dm = new FC_ACCT_9930_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.print();

		try {
			FC_ACCT_9900DAO dao = new FC_ACCT_9900DAO();
        	ds = dao.fc_acct_9930_l(dm);  
            req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
		

	
	}
    
    public void fc_acct_9931_s(HttpServletRequest req, HttpServletResponse res) throws   AppException, SQLException {

    	FC_ACCT_9931_SDataSet ds = null;

    	String cmpy_cd  = Util.getSessionParameterValue(req, "cmpycd", true);
    	String occr_dt = Util.checkString(req.getParameter("occr_dt"));
    	String seq = Util.checkString(req.getParameter("seq"));
    	String add_file_gb = Util.checkString(req.getParameter("add_file_gb"));
    	String add_file_no = Util.checkString(req.getParameter("add_file_no"));
        // DM Setting
    	FC_ACCT_9931_SDM dm = new FC_ACCT_9931_SDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setOccr_dt(occr_dt);
    	dm.setSeq(seq);
    	dm.setAdd_file_gb(add_file_gb);
    	dm.setAdd_file_no(add_file_no);
    	
    	dm.print();
    	
        try {
        	FC_ACCT_9900DAO dao = new FC_ACCT_9900DAO();
            ds = dao.fc_acct_9931_s(dm);
            req.setAttribute("ds", ds);
	        req.setAttribute("add_file", ds.add_file); // request에 결과값을 담는다.
	        req.setAttribute("add_file_nm", ds.add_file_nm); // request에 결과값을 담는다.  
	        
        }  
        catch (AppException e) {
            throw e;
        }   	
  
    } 
    
    public void fc_acct_9940_l(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
		FC_ACCT_9940_LDataSet ds = null;
		FC_ACCT_9940_LDM dm = new FC_ACCT_9940_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.add_file_no = Util.checkString(req.getParameter("add_file_no"));
		dm.print();

		try {
			FC_ACCT_9900DAO dao = new FC_ACCT_9900DAO();
			ds = dao.fc_acct_9940_l(dm);
        	req.setAttribute("ds", ds);
        }
        catch (AppException e) {
            LogManager.getInstance().log(e);
            throw e;
        }
	
	}
        
}

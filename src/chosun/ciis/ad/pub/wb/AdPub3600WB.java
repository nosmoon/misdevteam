/***************************************************************************************************
* 파일명 : AdPub3600WB.java
* 기능 : 
 * 작성일자 : 
 * 작성자 : 정호근
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 : 
* 백업 :
***************************************************************************************************/

package chosun.ciis.ad.pub.wb;

import java.sql.CallableStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Hashtable;
import somo.framework.expt.AppException;
import somo.framework.util.Util;
import java.sql.SQLException;
import java.rmi.RemoteException;
import java.util.StringTokenizer;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;

import chosun.ciis.ad.pub.dao.AdPub3600DAO;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.co.base.wb.BaseWB;
/**
 * 
 */

public class AdPub3600WB extends BaseWB {

    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_3600_m(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3600_MDataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);
    	
    	AD_PUB_3600_MDM dm = new AD_PUB_3600_MDM();
    	dm.setCmpy_cd(cmpy_cd); 
    	dm.print();
        try {
        	AdPub3600DAO	dao = new AdPub3600DAO();
            ds = dao.ad_pub_3600_m(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    } 		
	
    /**
     * 
     *
     * @param req HttpServletRequest
     * @param res HttpServletResponse
     * @throws AppException
     */
    public void ad_pub_3610_l(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3610_LDataSet ds = null;

        // DM Setting
    	String cmpy_cd    		= Util.getSessionParameterValue(req, "cmpycd", true);    	
    	String medi_cd 			= Util.checkString(req.getParameter("medi_cd"));
    	String select_dt 		= Util.checkString(req.getParameter("select_dt"));
    	String frdt             = Util.checkString(req.getParameter("frdt"));
    	String todt             = Util.checkString(req.getParameter("todt"));
    	String cslcrg_pers      = Util.checkString(req.getParameter("slcrg_pers"));
    	String pubc_slip_no     = Util.checkString(req.getParameter("pubc_slip_no"));
    	String acct_cd          = Util.getSessionParameterValue(req, "uid", true);
    	String emp_no           = Util.getSessionParameterValue(req, "emp_no", true);
    	
    	AD_PUB_3610_LDM dm = new AD_PUB_3610_LDM();
    	dm.setCmpy_cd(cmpy_cd);
    	dm.setMedi_cd(medi_cd);
    	dm.setSelect_dt(select_dt);
    	dm.setFrdt(frdt);
    	dm.setTodt(todt);
    	dm.setCslcrg_pers(cslcrg_pers);
    	dm.setPubc_slip_no(pubc_slip_no);
    	dm.setAcct_cd(acct_cd);
    	dm.setEmp_no(emp_no);
    	dm.print();
        try {
        	AdPub3600DAO	dao = new AdPub3600DAO();
            ds = dao.ad_pub_3610_l(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }  

    public void ad_pub_3620_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager        = null;
    	AD_PUB_3620_ADataSet ds = null;
		CallableStatement cstmt = null;
			
        // DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
    	System.out.println(hash.get("pubc_slip_no"));
    	String[]  mode 				=  Util.checkString((String)hash.get("m" )).split("#" );
    	String[]  pubc_slip_no 		=  Util.checkString((String)hash.get("pubc_slip_no" )).split("#" );  //광고게재전표
    	String[]  medi_nm 			=  Util.checkString((String)hash.get("medi_nm" )).split("#" );  //매체
    	String[]  cslcrg_pers_nm   	=  Util.checkString((String)hash.get("cslcrg_pers_nm" )).split("#" );  //현영업담당
    	
    	AD_PUB_3620_ADM dm = new AD_PUB_3620_ADM();

        try {
					//0.DB연결
    		manager = new DBManager("MISADV");
	       	manager.getConnection();
	       	manager.m_conn.setAutoCommit(false);        

			for( int row=0; row<pubc_slip_no.length; row++){
			   	dm.setCmpy_cd(cmpy_cd);
			    	
			   	dm.setPubc_slip_no(pubc_slip_no[row]);
			   	dm.setMedi_nm(medi_nm[row]);
			   	dm.setCslcrg_pers_nm(cslcrg_pers_nm[row]);
			   	dm.setMode(mode[row].toUpperCase());
			    	
			   	dm.setIncmg_pers_ip(incmg_pers_ip);
			   	dm.setIncmg_pers(incmg_pers);
			   	dm.print();
			    	
		     	cstmt = manager.m_conn.prepareCall(dm.getSQL());
		       	// 파라미터 설정
		       	dm.setParams(cstmt,dm);
		       	// 실행
		       	cstmt.execute();		       		

		        // 결과
		       	ds = (AD_PUB_3620_ADataSet) dm.createDataSetObject();
		       	ds.getValues(cstmt);
		       	cstmt.close();
		       	if (!"".equals(ds.errcode)) {
			            throw new AppException(ds.errcode, ds.errmsg);
		        }
	    		System.out.println("AD_PUB_3620_A실행완료"+row);		 
			}//for  
			manager.commit();
        }
	    catch (AppException e) {
		      if (manager != null ){
		          manager.rollback();
		      }
             throw e;   
		}catch (SQLException e) {
		    if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
		}catch (Exception e) {
		      if (manager != null)
		          manager.rollback();	
	    	  throw new SysException(e);
	    } finally {	    	
		    if (manager != null)	
		    	manager.disConnection();
	    }
            req.setAttribute("ds", ds);         
    }         
    /*
    public void ad_pub_3620_a(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	
    	AD_PUB_3620_ADataSet ds = null;

        // DM Setting
    	String cmpy_cd       = Util.getSessionParameterValue(req, "cmpycd", true);
    	String incmg_pers    = Util.getSessionParameterValue(req, "emp_no", true);
    	String incmg_pers_ip = req.getRemoteAddr();

    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
    	
    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);

    	String mode				= Util.checkString((String)hash.get("m"));
    	String pubc_slip_no     = Util.checkString((String)hash.get("pubc_slip_no"));
    	String medi_nm 			= Util.checkString((String)hash.get("medi_nm"));
    	String cslcrg_pers_nm   = Util.checkString((String)hash.get("cslcrg_pers_nm"));
    	
    	AD_PUB_3620_ADM dm = new AD_PUB_3620_ADM();
    	dm.setCmpy_cd(cmpy_cd);
    	
    	dm.setPubc_slip_no(pubc_slip_no);
    	dm.setMedi_nm(medi_nm);
    	dm.setCslcrg_pers_nm(cslcrg_pers_nm);
    	dm.setMode(mode.toUpperCase());
    	
    	dm.setIncmg_pers_ip(incmg_pers_ip);
    	dm.setIncmg_pers(incmg_pers);

    	dm.print();

        try {
        	AdPub3600DAO	dao = new AdPub3600DAO();
            ds = dao.ad_pub_3620_a(dm);
            req.setAttribute("ds", ds);  
        }
        catch (AppException e) {
            throw e;
        } 
    }  
    */       
}

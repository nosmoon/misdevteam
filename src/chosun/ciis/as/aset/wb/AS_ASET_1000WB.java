/***************************************************************************************************
* 파일명 : 
* 기능 : 
 * 작성일자 : 
 * 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/

package chosun.ciis.as.aset.wb;

import java.util.*;
import java.rmi.RemoteException;
import java.io.*;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.multipart.*;

import chosun.ciis.co.base.util.*;
import chosun.ciis.co.base.wb.BaseWB;
import somo.framework.db.BaseDataSet;
import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.db.DBManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */

public class AS_ASET_1000WB extends BaseWB {
    
	public void as_aset_1001_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1001_MDataSet ds = null;
		AS_ASET_1001_MDM dm = new AS_ASET_1001_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1001_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1001_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

	public void as_aset_1002_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1002_LDataSet ds = null;
		AS_ASET_1002_LDM dm = new AS_ASET_1002_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_aset_no = Util.checkString(req.getParameter("fr_aset_no"));
		dm.to_aset_no = Util.checkString(req.getParameter("to_aset_no"));
		dm.buy_clsf = Util.checkString(req.getParameter("buy_clsf"));
		dm.fr_dlco_ern = Util.checkString(req.getParameter("fr_dlco_ern"));
		dm.to_dlco_ern = Util.checkString(req.getParameter("to_dlco_ern"));
		dm.fr_dept_cd = Util.checkString(req.getParameter("fr_dept_cd"));
		dm.to_dept_cd = Util.checkString(req.getParameter("to_dept_cd"));
		dm.fr_acqr_dt = Util.checkString(req.getParameter("fr_acqr_dt"));
		dm.to_acqr_dt = Util.checkString(req.getParameter("to_acqr_dt"));
		dm.fr_acqr_amt = Util.checkString(req.getParameter("fr_acqr_amt"));
		dm.to_acqr_amt = Util.checkString(req.getParameter("to_acqr_amt"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1002_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1002_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/	
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.fr_aset_no = (String)hash.get("fr_aset_no");
		dm.to_aset_no = (String)hash.get("to_aset_no");
		dm.buy_clsf = (String)hash.get("buy_clsf");
		dm.fr_dlco_ern = (String)hash.get("fr_dlco_ern");
		dm.to_dlco_ern = (String)hash.get("to_dlco_ern");
		dm.fr_dept_cd = (String)hash.get("fr_dept_cd");
		dm.to_dept_cd = (String)hash.get("to_dept_cd");
		dm.fr_acqr_dt = (String)hash.get("fr_acqr_dt");
		dm.to_acqr_dt = (String)hash.get("to_acqr_dt");
		dm.fr_acqr_amt = (String)hash.get("fr_acqr_amt");
		dm.to_acqr_amt = (String)hash.get("to_acqr_amt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fr_aset_no = Util.getSessionParameterValue(req,"fr_aset_no",true);
		dm.to_aset_no = Util.getSessionParameterValue(req,"to_aset_no",true);
		dm.buy_clsf = Util.getSessionParameterValue(req,"buy_clsf",true);
		dm.fr_dlco_ern = Util.getSessionParameterValue(req,"fr_dlco_ern",true);
		dm.to_dlco_ern = Util.getSessionParameterValue(req,"to_dlco_ern",true);
		dm.fr_dept_cd = Util.getSessionParameterValue(req,"fr_dept_cd",true);
		dm.to_dept_cd = Util.getSessionParameterValue(req,"to_dept_cd",true);
		dm.fr_acqr_dt = Util.getSessionParameterValue(req,"fr_acqr_dt",true);
		dm.to_acqr_dt = Util.getSessionParameterValue(req,"to_acqr_dt",true);
		dm.fr_acqr_amt = Util.getSessionParameterValue(req,"fr_acqr_amt",true);
		dm.to_acqr_amt = Util.getSessionParameterValue(req,"to_acqr_amt",true);
		*******************************************************************************************/
	}
    
	public void as_aset_1003_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1003_SDataSet ds = null;
		AS_ASET_1003_SDM dm = new AS_ASET_1003_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
//		dm.print();
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1003_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1003_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aset_no = (String)hash.get("aset_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		*******************************************************************************************/
	}

	public void as_aset_1004_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1004_SDataSet ds = null;
		AS_ASET_1004_SDM dm = new AS_ASET_1004_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
//		dm.print();
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1004_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1004_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aset_no = (String)hash.get("aset_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		*******************************************************************************************/
	}

	public void as_aset_1005_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1005_SDataSet ds = null;
		AS_ASET_1005_SDM dm = new AS_ASET_1005_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
//		dm.print();
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1005_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1005_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aset_no = (String)hash.get("aset_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		*******************************************************************************************/
	}

	public void as_aset_1006_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1006_SDataSet ds = null;
		AS_ASET_1006_SDM dm = new AS_ASET_1006_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
//		dm.print();
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1006_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1006_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aset_no = (String)hash.get("aset_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		*******************************************************************************************/
	}

	public void as_aset_1007_s(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1007_SDataSet ds = null;
		AS_ASET_1007_SDM dm = new AS_ASET_1007_SDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
//		dm.print();
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1007_SDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1007_s(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aset_no = (String)hash.get("aset_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		*******************************************************************************************/
	}

	public void as_aset_1008_a(HttpServletRequest req, HttpServletResponse res) throws AppException, IOException {
		Hashtable ht = new Hashtable();
		//byte[] up_phot_img = null;
		byte[] up_phot_img = new byte[1048576]; //10Mb
		 
    	String file_name = "";
    	String file_size = "";
        
        int sizeLimit = 10 * 1024 * 1024 ;
        MultipartParser mp = new MultipartParser(req, sizeLimit, true, true, "EUC-KR"); // 10MB 

        AS_ASET_1008_ADataSet ds = null;
		AS_ASET_1008_ADM dm = new AS_ASET_1008_ADM();

        Part part; 
        while ((part = mp.readNextPart()) != null) {
            String name  = part.getName();
            if (part.isParam()) {
    			ht.put(part.getName(), ((ParamPart)part).getStringValue());
            }else if (part.isFile()) {
                FilePart filePart = (FilePart) part;
                file_name = filePart.getFileName();

                if ( file_name != null ) {
                	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    				((FilePart)part).writeTo(byteArrayOutputStream);
    				up_phot_img = byteArrayOutputStream.toByteArray();
    	    		dm.up_phot_img = up_phot_img;
    	    		file_size = String.valueOf(up_phot_img.length);
                }
            }
        }
        
        dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.mode            = Util.checkString((String)ht.get("mode"));     
		dm.item_cd         = Util.checkString((String)ht.get("item_cd"));     
		dm.unit_cd         = Util.checkString((String)ht.get("unit_cd"));
		dm.budg_cd         = Util.checkString((String)ht.get("budg_cd"));
		dm.redm_clsf       = Util.checkString((String)ht.get("redm_clsf"));
		dm.redm_mthd_cd    = Util.checkString((String)ht.get("redm_mthd_cd"));
		dm.svc_yys_cnt     = Util.checkString((String)ht.get("svc_yys_cnt"));
		dm.aset_no         = Util.checkString((String)ht.get("aset_no"));     
		dm.aset_nm         = Util.checkString((String)ht.get("aset_nm"));     
		dm.buy_clsf        = Util.checkString((String)ht.get("buy_clsf"));     
		dm.aset_stat       = Util.checkString((String)ht.get("aset_stat"));         		
		dm.dept_cd         = Util.checkString((String)ht.get("dept_cd"));     
		dm.acqr_dt         = Util.checkString((String)ht.get("acqr_dt"));     
		dm.orgin_acqr_amt  = Util.checkString((String)ht.get("orgin_acqr_amt"));     
		dm.vat_amt         = Util.checkString((String)ht.get("vat_amt"));     
		dm.dlco_clsf_cd    = Util.checkString((String)ht.get("dlco_clsf_cd"));     
		dm.dlco_ern        = Util.checkString((String)ht.get("dlco_ern"));     
		dm.bund_cd         = Util.checkString((String)ht.get("bund_cd"));     
		dm.aset_size       = Util.checkString((String)ht.get("aset_size"));     
		dm.aset_loca       = Util.checkString((String)ht.get("aset_loca"));     
		dm.aset_qunt_cnt   = Util.checkString((String)ht.get("aset_qunt_cnt"));     
		dm.aset_usag       = Util.checkString((String)ht.get("aset_usag"));     
		dm.aset_grp_yn     = Util.checkString((String)ht.get("aset_grp_yn"));
		dm.slip_occr_dt    = Util.checkString((String)ht.get("slip_occr_dt"));
		dm.slip_clsf_cd    = Util.checkString((String)ht.get("slip_clsf_cd"));
		dm.slip_seq        = Util.checkString((String)ht.get("slip_seq"));
		dm.insr_type_cd    = Util.checkString((String)ht.get("insr_type_cd"));
		dm.use_emp_no      = Util.checkString((String)ht.get("use_emp_no"));
		dm.use_cmpy_cd     = Util.checkString((String)ht.get("use_cmpy_cd"));
		dm.land_plcw       = Util.checkString((String)ht.get("land_plcw"));
		dm.acqr_land_amt   = Util.checkString((String)ht.get("acqr_land_amt"));
		dm.acqr_yymm       = Util.checkString((String)ht.get("acqr_yymm"));
		dm.now_land_amt    = Util.checkString((String)ht.get("now_land_amt"));
		dm.now_yymm        = Util.checkString((String)ht.get("now_yymm"));
		dm.land_usag       = Util.checkString((String)ht.get("land_usag"));
		dm.rela_aset_no    = Util.checkString((String)ht.get("rela_aset_no"));
		dm.bldg_plcw       = Util.checkString((String)ht.get("bldg_plcw"));
		dm.land_size       = Util.checkString((String)ht.get("land_size"));
		dm.bldg_size       = Util.checkString((String)ht.get("bldg_size"));
		dm.flor_size       = Util.checkString((String)ht.get("flor_size"));
		dm.arch            = Util.checkString((String)ht.get("arch"));
		dm.flor_cnt        = Util.checkString((String)ht.get("flor_cnt"));
		dm.cmpl_yymm       = Util.checkString((String)ht.get("cmpl_yymm"));
		dm.acqr_tax_amt    = Util.checkString((String)ht.get("acqr_tax_amt"));
		dm.acqr_tax_yymm   = Util.checkString((String)ht.get("acqr_tax_yymm"));
		dm.now_tax_amt     = Util.checkString((String)ht.get("now_tax_amt"));
		dm.now_tax_yymm    = Util.checkString((String)ht.get("now_tax_yymm"));
		dm.blng_ward_offi  = Util.checkString((String)ht.get("blng_ward_offi"));
		dm.under_flor      = Util.checkString((String)ht.get("under_flor"));
		dm.under_size      = Util.checkString((String)ht.get("under_size"));
		dm.bldg_prmt_dt    = Util.checkString((String)ht.get("bldg_prmt_dt"));
		dm.leas_ern_no     = Util.checkString((String)ht.get("leas_ern_no"));
		dm.rela_no         = Util.checkString((String)ht.get("rela_no"));
		dm.car_no          = Util.checkString((String)ht.get("car_no"));
		dm.usag            = Util.checkString((String)ht.get("usag"));
		dm.car_engine_size = Util.checkString((String)ht.get("car_engine_size"));
		dm.car_kind        = Util.checkString((String)ht.get("car_kind"));
		dm.insr_no         = Util.checkString((String)ht.get("insr_no"));
		dm.quorum_cnt      = Util.checkString((String)ht.get("quorum_cnt"));
		dm.car_mang_no     = Util.checkString((String)ht.get("car_mang_no"));
		dm.car_make_yymm   = Util.checkString((String)ht.get("car_make_yymm"));
		dm.car_usag        = Util.checkString((String)ht.get("car_usag"));
		dm.use_car_oil     = Util.checkString((String)ht.get("use_car_oil"));
		dm.make_natn       = Util.checkString((String)ht.get("make_natn"));
		dm.make_cmpy       = Util.checkString((String)ht.get("make_cmpy"));
		dm.make_yymm       = Util.checkString((String)ht.get("make_yymm"));
		dm.make_no         = Util.checkString((String)ht.get("make_no"));
		dm.mang_no         = Util.checkString((String)ht.get("mang_no"));
		dm.remk            = Util.checkString((String)ht.get("remk"));
		dm.mst_remk        = Util.checkString((String)ht.get("mst_remk"));
		dm.mst_chnl_clsf_cd    = Util.checkString((String)ht.get("mst_chnl_clsf_cd"));
		dm.file_size       = Util.checkString(file_size);
		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1008_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
/*        
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

            Part part; 
            while ((part = mp.readNextPart()) != null) {
                String name  = part.getName();
                if (part.isParam()) {
        			ht.put(part.getName(), ((ParamPart)part).getStringValue());
                }else if (part.isFile()) {
                    FilePart filePart = (FilePart) part;
                    file_name = filePart.getFileName();

                    if ( file_name != null ) {
                    	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        				((FilePart)part).writeTo(byteArrayOutputStream);
        				up_phot_img = byteArrayOutputStream.toByteArray();
        	    		dm.up_phot_img = up_phot_img;
        	    		file_size = String.valueOf(up_phot_img.length);
                    }
                }
            }
            
            dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
    		dm.incmg_pers_ipadd = Util.checkString(req.getRemoteAddr());
    		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
    		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

    		dm.mode            = Util.checkString((String)ht.get("mode"));     
    		dm.item_cd         = Util.checkString((String)ht.get("item_cd"));     
    		dm.unit_cd         = Util.checkString((String)ht.get("unit_cd"));
    		dm.budg_cd         = Util.checkString((String)ht.get("budg_cd"));
    		dm.redm_clsf       = Util.checkString((String)ht.get("redm_clsf"));
    		dm.redm_mthd_cd    = Util.checkString((String)ht.get("redm_mthd_cd"));
    		dm.svc_yys_cnt     = Util.checkString((String)ht.get("svc_yys_cnt"));
    		dm.aset_no         = Util.checkString((String)ht.get("aset_no"));     
    		dm.aset_nm         = Util.checkString((String)ht.get("aset_nm"));     
    		dm.buy_clsf        = Util.checkString((String)ht.get("buy_clsf"));     
    		dm.aset_stat       = Util.checkString((String)ht.get("aset_stat"));         		
    		dm.dept_cd         = Util.checkString((String)ht.get("dept_cd"));     
    		dm.acqr_dt         = Util.checkString((String)ht.get("acqr_dt"));     
    		dm.orgin_acqr_amt  = Util.checkString((String)ht.get("orgin_acqr_amt"));     
    		dm.vat_amt         = Util.checkString((String)ht.get("vat_amt"));     
    		dm.dlco_clsf_cd    = Util.checkString((String)ht.get("dlco_clsf_cd"));     
    		dm.dlco_ern        = Util.checkString((String)ht.get("dlco_ern"));     
    		dm.bund_cd         = Util.checkString((String)ht.get("bund_cd"));     
    		dm.aset_size       = Util.checkString((String)ht.get("aset_size"));     
    		dm.aset_loca       = Util.checkString((String)ht.get("aset_loca"));     
    		dm.aset_qunt_cnt   = Util.checkString((String)ht.get("aset_qunt_cnt"));     
    		dm.aset_usag       = Util.checkString((String)ht.get("aset_usag"));     
    		dm.aset_grp_yn     = Util.checkString((String)ht.get("aset_grp_yn"));
    		dm.slip_occr_dt    = Util.checkString((String)ht.get("slip_occr_dt"));
    		dm.slip_clsf_cd    = Util.checkString((String)ht.get("slip_clsf_cd"));
    		dm.slip_seq        = Util.checkString((String)ht.get("slip_seq"));
    		dm.land_plcw       = Util.checkString((String)ht.get("land_plcw"));
    		dm.acqr_land_amt   = Util.checkString((String)ht.get("acqr_land_amt"));
    		dm.acqr_yymm       = Util.checkString((String)ht.get("acqr_yymm"));
    		dm.now_land_amt    = Util.checkString((String)ht.get("now_land_amt"));
    		dm.now_yymm        = Util.checkString((String)ht.get("now_yymm"));
    		dm.land_usag       = Util.checkString((String)ht.get("land_usag"));
    		dm.rela_aset_no    = Util.checkString((String)ht.get("rela_aset_no"));
    		dm.bldg_plcw       = Util.checkString((String)ht.get("bldg_plcw"));
    		dm.land_size       = Util.checkString((String)ht.get("land_size"));
    		dm.bldg_size       = Util.checkString((String)ht.get("bldg_size"));
    		dm.flor_size       = Util.checkString((String)ht.get("flor_size"));
    		dm.arch            = Util.checkString((String)ht.get("arch"));
    		dm.flor_cnt        = Util.checkString((String)ht.get("flor_cnt"));
    		dm.cmpl_yymm       = Util.checkString((String)ht.get("cmpl_yymm"));
    		dm.acqr_tax_amt    = Util.checkString((String)ht.get("acqr_tax_amt"));
    		dm.acqr_tax_yymm   = Util.checkString((String)ht.get("acqr_tax_yymm"));
    		dm.now_tax_amt     = Util.checkString((String)ht.get("now_tax_amt"));
    		dm.now_tax_yymm    = Util.checkString((String)ht.get("now_tax_yymm"));
    		dm.blng_ward_offi  = Util.checkString((String)ht.get("blng_ward_offi"));
    		dm.under_flor      = Util.checkString((String)ht.get("under_flor"));
    		dm.under_size      = Util.checkString((String)ht.get("under_size"));
    		dm.bldg_prmt_dt    = Util.checkString((String)ht.get("bldg_prmt_dt"));
    		dm.leas_ern_no     = Util.checkString((String)ht.get("leas_ern_no"));
    		dm.rela_no         = Util.checkString((String)ht.get("rela_no"));
    		dm.car_no          = Util.checkString((String)ht.get("car_no"));
    		dm.usag            = Util.checkString((String)ht.get("usag"));
    		dm.car_engine_size = Util.checkString((String)ht.get("car_engine_size"));
    		dm.car_kind        = Util.checkString((String)ht.get("car_kind"));
    		dm.insr_no         = Util.checkString((String)ht.get("insr_no"));
    		dm.quorum_cnt      = Util.checkString((String)ht.get("quorum_cnt"));
    		dm.car_mang_no     = Util.checkString((String)ht.get("car_mang_no"));
    		dm.car_make_yymm   = Util.checkString((String)ht.get("car_make_yymm"));
    		dm.car_usag        = Util.checkString((String)ht.get("car_usag"));
    		dm.use_car_oil     = Util.checkString((String)ht.get("use_car_oil"));
    		dm.make_natn       = Util.checkString((String)ht.get("make_natn"));
    		dm.make_cmpy       = Util.checkString((String)ht.get("make_cmpy"));
    		dm.make_yymm       = Util.checkString((String)ht.get("make_yymm"));
    		dm.make_no         = Util.checkString((String)ht.get("make_no"));
    		dm.mang_no         = Util.checkString((String)ht.get("mang_no"));
    		dm.remk            = Util.checkString((String)ht.get("remk"));
    		
    		dm.file_size       = Util.checkString(file_size);
    		dm.print();

            ds = ejb.as_aset_1008_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/              
		
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.item_cd = (String)hash.get("item_cd");
		dm.aset_no = (String)hash.get("aset_no");
		dm.aset_nm = (String)hash.get("aset_nm");
		dm.buy_clsf = (String)hash.get("buy_clsf");	
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.acqr_dt = (String)hash.get("acqr_dt");
		dm.orgin_acqr_amt = (String)hash.get("orgin_acqr_amt");
		dm.vat_amt = (String)hash.get("vat_amt");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_no = (String)hash.get("dlco_no");
		dm.bund_cd = (String)hash.get("bund_cd");
		dm.aset_size = (String)hash.get("aset_size");
		dm.aset_loca = (String)hash.get("aset_loca");
		dm.aset_qunt_cnt = (String)hash.get("aset_qunt_cnt");
		dm.aset_usag = (String)hash.get("aset_usag");
		dm.aset_grp_yn = (String)hash.get("aset_grp_yn");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.land_plcw = (String)hash.get("land_plcw");
		dm.acqr_land_amt = (String)hash.get("acqr_land_amt");
		dm.acqr_yymm = (String)hash.get("acqr_yymm");
		dm.now_land_amt = (String)hash.get("now_land_amt");
		dm.now_yymm = (String)hash.get("now_yymm");
		dm.land_usag = (String)hash.get("land_usag");
		dm.rela_aset_no = (String)hash.get("rela_aset_no");
		dm.bldg_plcw = (String)hash.get("bldg_plcw");
		dm.land_size = (String)hash.get("land_size");
		dm.bldg_size = (String)hash.get("bldg_size");
		dm.flor_size = (String)hash.get("flor_size");
		dm.arch = (String)hash.get("arch");
		dm.flor_cnt = (String)hash.get("flor_cnt");
		dm.cmpl_yymm = (String)hash.get("cmpl_yymm");
		dm.acqr_tax_amt = (String)hash.get("acqr_tax_amt");
		dm.acqr_tax_yymm = (String)hash.get("acqr_tax_yymm");
		dm.now_tax_amt = (String)hash.get("now_tax_amt");
		dm.now_tax_yymm = (String)hash.get("now_tax_yymm");
		dm.blng_ward_offi = (String)hash.get("blng_ward_offi");
		dm.under_flor = (String)hash.get("under_flor");
		dm.under_size = (String)hash.get("under_size");
		dm.bldg_prmt_dt = (String)hash.get("bldg_prmt_dt");
		dm.leas_ern_no = (String)hash.get("leas_ern_no");
		dm.rela_no = (String)hash.get("rela_no");
		dm.car_no = (String)hash.get("car_no");
		dm.usag = (String)hash.get("usag");
		dm.car_engine_size = (String)hash.get("car_engine_size");
		dm.car_kind = (String)hash.get("car_kind");
		dm.insr_no = (String)hash.get("insr_no");
		dm.quorum_cnt = (String)hash.get("quorum_cnt");
		dm.car_mang_no = (String)hash.get("car_mang_no");
		dm.car_make_yymm = (String)hash.get("car_make_yymm");
		dm.car_usag = (String)hash.get("car_usag");
		dm.use_car_oil = (String)hash.get("use_car_oil");
		dm.make_natn = (String)hash.get("make_natn");
		dm.make_cmpy = (String)hash.get("make_cmpy");
		dm.make_yymm = (String)hash.get("make_yymm");
		dm.make_no = (String)hash.get("make_no");
		dm.mang_no = (String)hash.get("mang_no");
		dm.remk = (String)hash.get("remk");
		dm.file_size = (String)hash.get("file_size");
		dm.phot_img = (String)hash.get("phot_img");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.item_cd = Util.getSessionParameterValue(req,"item_cd",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		dm.aset_nm = Util.getSessionParameterValue(req,"aset_nm",true);
		dm.buy_clsf = Util.getSessionParameterValue(req,"buy_clsf",true);	
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.acqr_dt = Util.getSessionParameterValue(req,"acqr_dt",true);
		dm.orgin_acqr_amt = Util.getSessionParameterValue(req,"orgin_acqr_amt",true);
		dm.vat_amt = Util.getSessionParameterValue(req,"vat_amt",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_no = Util.getSessionParameterValue(req,"dlco_no",true);
		dm.bund_cd = Util.getSessionParameterValue(req,"bund_cd",true);
		dm.aset_size = Util.getSessionParameterValue(req,"aset_size",true);
		dm.aset_loca = Util.getSessionParameterValue(req,"aset_loca",true);
		dm.aset_qunt_cnt = Util.getSessionParameterValue(req,"aset_qunt_cnt",true);
		dm.aset_usag = Util.getSessionParameterValue(req,"aset_usag",true);
		dm.aset_grp_yn = Util.getSessionParameterValue(req,"aset_grp_yn",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.land_plcw = Util.getSessionParameterValue(req,"land_plcw",true);
		dm.acqr_land_amt = Util.getSessionParameterValue(req,"acqr_land_amt",true);
		dm.acqr_yymm = Util.getSessionParameterValue(req,"acqr_yymm",true);
		dm.now_land_amt = Util.getSessionParameterValue(req,"now_land_amt",true);
		dm.now_yymm = Util.getSessionParameterValue(req,"now_yymm",true);
		dm.land_usag = Util.getSessionParameterValue(req,"land_usag",true);
		dm.rela_aset_no = Util.getSessionParameterValue(req,"rela_aset_no",true);
		dm.bldg_plcw = Util.getSessionParameterValue(req,"bldg_plcw",true);
		dm.land_size = Util.getSessionParameterValue(req,"land_size",true);
		dm.bldg_size = Util.getSessionParameterValue(req,"bldg_size",true);
		dm.flor_size = Util.getSessionParameterValue(req,"flor_size",true);
		dm.arch = Util.getSessionParameterValue(req,"arch",true);
		dm.flor_cnt = Util.getSessionParameterValue(req,"flor_cnt",true);
		dm.cmpl_yymm = Util.getSessionParameterValue(req,"cmpl_yymm",true);
		dm.acqr_tax_amt = Util.getSessionParameterValue(req,"acqr_tax_amt",true);
		dm.acqr_tax_yymm = Util.getSessionParameterValue(req,"acqr_tax_yymm",true);
		dm.now_tax_amt = Util.getSessionParameterValue(req,"now_tax_amt",true);
		dm.now_tax_yymm = Util.getSessionParameterValue(req,"now_tax_yymm",true);
		dm.blng_ward_offi = Util.getSessionParameterValue(req,"blng_ward_offi",true);
		dm.under_flor = Util.getSessionParameterValue(req,"under_flor",true);
		dm.under_size = Util.getSessionParameterValue(req,"under_size",true);
		dm.bldg_prmt_dt = Util.getSessionParameterValue(req,"bldg_prmt_dt",true);
		dm.leas_ern_no = Util.getSessionParameterValue(req,"leas_ern_no",true);
		dm.rela_no = Util.getSessionParameterValue(req,"rela_no",true);
		dm.car_no = Util.getSessionParameterValue(req,"car_no",true);
		dm.usag = Util.getSessionParameterValue(req,"usag",true);
		dm.car_engine_size = Util.getSessionParameterValue(req,"car_engine_size",true);
		dm.car_kind = Util.getSessionParameterValue(req,"car_kind",true);
		dm.insr_no = Util.getSessionParameterValue(req,"insr_no",true);
		dm.quorum_cnt = Util.getSessionParameterValue(req,"quorum_cnt",true);
		dm.car_mang_no = Util.getSessionParameterValue(req,"car_mang_no",true);
		dm.car_make_yymm = Util.getSessionParameterValue(req,"car_make_yymm",true);
		dm.car_usag = Util.getSessionParameterValue(req,"car_usag",true);
		dm.use_car_oil = Util.getSessionParameterValue(req,"use_car_oil",true);
		dm.make_natn = Util.getSessionParameterValue(req,"make_natn",true);
		dm.make_cmpy = Util.getSessionParameterValue(req,"make_cmpy",true);
		dm.make_yymm = Util.getSessionParameterValue(req,"make_yymm",true);
		dm.make_no = Util.getSessionParameterValue(req,"make_no",true);
		dm.mang_no = Util.getSessionParameterValue(req,"mang_no",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.file_size = Util.getSessionParameterValue(req,"file_size",true);
		dm.phot_img = Util.getSessionParameterValue(req,"phot_img",true);
		*******************************************************************************************/
	}

	public void as_aset_1009_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1009_LDataSet ds = null;
		AS_ASET_1009_LDM dm = new AS_ASET_1009_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.item_cd = Util.checkString(req.getParameter("item_cd"));
//		dm.print();
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1009_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1009_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.item_cd = (String)hash.get("item_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.item_cd = Util.getSessionParameterValue(req,"item_cd",true);
		*******************************************************************************************/
	}
	public void as_aset_1010_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1010_LDataSet ds = null;
		AS_ASET_1010_LDM dm = new AS_ASET_1010_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1010_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1010_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

	public void as_aset_1101_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1101_MDataSet ds = null;
		AS_ASET_1101_MDM dm = new AS_ASET_1101_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1101_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1101_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

	public void as_aset_1102_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1102_LDataSet ds = null;
		AS_ASET_1102_LDM dm = new AS_ASET_1102_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.fr_chg_dt = Util.checkString(req.getParameter("fr_chg_dt"));
		dm.to_chg_dt = Util.checkString(req.getParameter("to_chg_dt"));
		dm.chg_clsf = Util.checkString(req.getParameter("chg_clsf"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1102_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1102_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.fr_chg_dt = (String)hash.get("fr_chg_dt");
		dm.to_chg_dt = (String)hash.get("to_chg_dt");
		dm.chg_clsf = (String)hash.get("chg_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.fr_chg_dt = Util.getSessionParameterValue(req,"fr_chg_dt",true);
		dm.to_chg_dt = Util.getSessionParameterValue(req,"to_chg_dt",true);
		dm.chg_clsf = Util.getSessionParameterValue(req,"chg_clsf",true);
		*******************************************************************************************/
	}

	public void as_aset_1103_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1103_LDataSet ds = null;
		AS_ASET_1103_LDM dm = new AS_ASET_1103_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chg_clsf = Util.checkString(req.getParameter("chg_clsf"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1103_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1103_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_clsf = (String)hash.get("chg_clsf");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_clsf = Util.getSessionParameterValue(req,"chg_clsf",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}

	public void as_aset_1104_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1104_LDataSet ds = null;
		AS_ASET_1104_LDM dm = new AS_ASET_1104_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chg_clsf = Util.checkString(req.getParameter("chg_clsf"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1104_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1104_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_clsf = (String)hash.get("chg_clsf");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_clsf = Util.getSessionParameterValue(req,"chg_clsf",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}

	public void as_aset_1106_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1106_LDataSet ds = null;
		AS_ASET_1106_LDM dm = new AS_ASET_1106_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chg_clsf = Util.checkString(req.getParameter("chg_clsf"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1106_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1106_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_clsf = (String)hash.get("chg_clsf");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_clsf = Util.getSessionParameterValue(req,"chg_clsf",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}

	public void as_aset_1107_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1107_LDataSet ds = null;
		AS_ASET_1107_LDM dm = new AS_ASET_1107_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chg_clsf = Util.checkString(req.getParameter("chg_clsf"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1107_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1107_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_clsf = (String)hash.get("chg_clsf");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_clsf = Util.getSessionParameterValue(req,"chg_clsf",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}

	public void as_aset_1108_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1108_LDataSet ds = null;
		AS_ASET_1108_LDM dm = new AS_ASET_1108_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chg_clsf = Util.checkString(req.getParameter("chg_clsf"));
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1108_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1108_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_clsf = (String)hash.get("chg_clsf");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_clsf = Util.getSessionParameterValue(req,"chg_clsf",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}

	public void as_aset_1109_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1109_LDataSet ds = null;
		AS_ASET_1109_LDM dm = new AS_ASET_1109_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1109_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1109_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}

	public void as_aset_1110_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1110_ADataSet ds = null;
		AS_ASET_1110_ADM dm = new AS_ASET_1110_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.job_mode = Util.checkString(req.getParameter("job_mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.occr_dt = Util.checkString((String)hash.get("occr_dt"));
		dm.occr_seq = Util.checkString((String)hash.get("occr_seq"));
		dm.chg_clsf = Util.checkString((String)hash.get("chg_clsf"));
		
//		dm.print();
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1110_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1110_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.job_mode = (String)hash.get("job_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.chg_clsf = (String)hash.get("chg_clsf");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.job_mode = Util.getSessionParameterValue(req,"job_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.chg_clsf = Util.getSessionParameterValue(req,"chg_clsf",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}

	public void as_aset_1201_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1201_LDataSet ds = null;
		AS_ASET_1201_LDM dm = new AS_ASET_1201_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dt_clsf = Util.checkString(req.getParameter("dt_clsf"));
		dm.chg_clsf = Util.checkString(req.getParameter("chg_clsf"));
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1201_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1201_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dt_clsf = (String)hash.get("dt_clsf");
		dm.chg_clsf = (String)hash.get("chg_clsf");
		dm.chg_dt = (String)hash.get("chg_dt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dt_clsf = Util.getSessionParameterValue(req,"dt_clsf",true);
		dm.chg_clsf = Util.getSessionParameterValue(req,"chg_clsf",true);
		dm.chg_dt = Util.getSessionParameterValue(req,"chg_dt",true);
		*******************************************************************************************/
	}

	public void as_aset_1202_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1202_LDataSet ds = null;
		AS_ASET_1202_LDM dm = new AS_ASET_1202_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.aset_no_list = Util.checkString(req.getParameter("aset_no_list"));
//		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1202_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1202_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aset_no_list = (String)hash.get("aset_no_list");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.aset_no_list = Util.getSessionParameterValue(req,"aset_no_list",true);
		*******************************************************************************************/
	}

	public void as_aset_1203_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1203_LDataSet ds = null;
		AS_ASET_1203_LDM dm = new AS_ASET_1203_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1203_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1203_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}


	public void as_aset_1204_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1204_IDataSet ds = null;
		AS_ASET_1204_IDM dm = new AS_ASET_1204_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		
		dm.aset_no = (String)hash.get("aset_no");
		dm.chg_amt = (String)hash.get("chg_amt");
		dm.chg_vat_amt = (String)hash.get("chg_vat_amt");
		dm.hsty_cnt = (String)hash.get("hsty_cnt");
		dm.hsty_dlco_ern = (String)hash.get("hsty_dlco_ern");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dtls_remk = (String)hash.get("dtls_remk");
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1204_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1204_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_dt = (String)hash.get("chg_dt");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.aset_no = (String)hash.get("aset_no");
		dm.chg_amt = (String)hash.get("chg_amt");
		dm.chg_vat_amt = (String)hash.get("chg_vat_amt");
		dm.hsty_cnt = (String)hash.get("hsty_cnt");
		dm.hsty_dlco_ern = (String)hash.get("hsty_dlco_ern");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dtls_remk = (String)hash.get("dtls_remk");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_dt = Util.getSessionParameterValue(req,"chg_dt",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		dm.chg_amt = Util.getSessionParameterValue(req,"chg_amt",true);
		dm.chg_vat_amt = Util.getSessionParameterValue(req,"chg_vat_amt",true);
		dm.hsty_cnt = Util.getSessionParameterValue(req,"hsty_cnt",true);
		dm.hsty_dlco_ern = Util.getSessionParameterValue(req,"hsty_dlco_ern",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.dtls_remk = Util.getSessionParameterValue(req,"dtls_remk",true);
		*******************************************************************************************/
	}

	public void as_aset_1205_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1205_ADataSet ds = null;
		AS_ASET_1205_ADM dm = new AS_ASET_1205_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.aset_no = (String)hash.get("aset_no");
		dm.chg_amt = (String)hash.get("chg_amt");
		dm.chg_vat_amt = (String)hash.get("chg_vat_amt");
		dm.hsty_cnt = (String)hash.get("hsty_cnt");
		dm.hsty_dlco_ern = (String)hash.get("hsty_dlco_ern");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dtls_remk = (String)hash.get("dtls_remk");
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1205_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1205_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.chg_dt = (String)hash.get("chg_dt");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.mode = (String)hash.get("mode");
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.aset_no = (String)hash.get("aset_no");
		dm.chg_amt = (String)hash.get("chg_amt");
		dm.chg_vat_amt = (String)hash.get("chg_vat_amt");
		dm.hsty_cnt = (String)hash.get("hsty_cnt");
		dm.hsty_dlco_ern = (String)hash.get("hsty_dlco_ern");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.dtls_remk = (String)hash.get("dtls_remk");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mst_mode = Util.getSessionParameterValue(req,"mst_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.chg_dt = Util.getSessionParameterValue(req,"chg_dt",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.sub_seq = Util.getSessionParameterValue(req,"sub_seq",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		dm.chg_amt = Util.getSessionParameterValue(req,"chg_amt",true);
		dm.chg_vat_amt = Util.getSessionParameterValue(req,"chg_vat_amt",true);
		dm.hsty_cnt = Util.getSessionParameterValue(req,"hsty_cnt",true);
		dm.hsty_dlco_ern = Util.getSessionParameterValue(req,"hsty_dlco_ern",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.dtls_remk = Util.getSessionParameterValue(req,"dtls_remk",true);
		*******************************************************************************************/
	}
	
	public void as_aset_1300_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1300_MDataSet ds = null;
		AS_ASET_1300_MDM dm = new AS_ASET_1300_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
//		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1300_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
	}
	
	public void as_aset_1301_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1301_LDataSet ds = null;
		AS_ASET_1301_LDM dm = new AS_ASET_1301_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1301_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1301_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/
	}
	
	public void as_aset_1302_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1302_IDataSet ds = null;
		AS_ASET_1302_IDM dm = new AS_ASET_1302_IDM();
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.aset_no = Util.checkString(req.getParameter("aset_no"));
		dm.now_dept_cd = Util.checkString(req.getParameter("now_dept_cd"));
		dm.now_loca = Util.checkString(req.getParameter("now_loca"));
		dm.dtls_remk = Util.checkString(req.getParameter("dtls_remk"));
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println("=====================================================");
		System.out.println("multiUpdateData=" + multiUpdateData );
		System.out.println("=====================================================");
		String[] converted = convertMultiUpdateData(multiUpdateData);
		
		int idx = 0;
		    
		System.out.println("length=" + converted.length);
		String aset_no				= converted[2];
		String now_dept_cd			= converted[6];
		String now_loca				= converted[8];
		String dtls_remk			= converted[9];

        dm.setAset_no(aset_no.toUpperCase());
        dm.setNow_dept_cd(now_dept_cd); 
        dm.setNow_loca(now_loca); 
        dm.setDtls_remk(dtls_remk);
		 
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1302_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1302_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_dt = (String)hash.get("chg_dt");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.aset_no = (String)hash.get("aset_no");
		dm.now_dept_cd = (String)hash.get("now_dept_cd");
		dm.now_loca = (String)hash.get("now_loca");
		dm.dtls_remk = (String)hash.get("dtls_remk");
		*******************************************************************************************/
	}
	public void as_aset_1303_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1303_ADataSet ds = null;
		AS_ASET_1303_ADM dm = new AS_ASET_1303_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println("==============================================================");
		System.out.println(multiUpdateData);
		System.out.println("==============================================================");
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		
		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.aset_no = (String)hash.get("aset_no");
		dm.now_dept_cd = (String)hash.get("now_dept_cd");
		dm.now_loca = (String)hash.get("now_loca");
		dm.dtls_remk = (String)hash.get("dtls_remk");
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1303_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1303_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.chg_dt = (String)hash.get("chg_dt");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.mode = (String)hash.get("mode");
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.aset_no = (String)hash.get("aset_no");
		dm.now_dept_cd = (String)hash.get("now_dept_cd");
		dm.now_loca = (String)hash.get("now_loca");
		dm.dtls_remk = (String)hash.get("dtls_remk");
		*******************************************************************************************/
	}
	
	public void as_aset_1304_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1304_LDataSet ds = null;
		AS_ASET_1304_LDM dm = new AS_ASET_1304_LDM();

		dm.hsty_dlco_ern = Util.checkString(req.getParameter("hsty_dlco_ern"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1304_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1304_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.hsty_dlco_ern = (String)hash.get("hsty_dlco_ern");
		*******************************************************************************************/
	}
	public void as_aset_1305_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1305_LDataSet ds = null;
		AS_ASET_1305_LDM dm = new AS_ASET_1305_LDM();
	
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.aset_no_list = Util.checkString(req.getParameter("aset_no_list"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1305_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1305_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.aset_no_list = (String)hash.get("aset_no_list");
		*******************************************************************************************/
	}
	
	public void as_aset_1401_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1401_LDataSet ds = null;
		AS_ASET_1401_LDM dm = new AS_ASET_1401_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1401_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1401_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

	public void as_aset_1402_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1402_LDataSet ds = null;
		AS_ASET_1402_LDM dm = new AS_ASET_1402_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.ndduc_year = Util.checkString(req.getParameter("ndduc_year"));
		dm.ndduc_prd_clsf = Util.checkString(req.getParameter("ndduc_prd_clsf"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1402_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1402_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.ndduc_year = (String)hash.get("ndduc_year");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.ndduc_year = Util.getSessionParameterValue(req,"ndduc_year",true);
		*******************************************************************************************/
	}

	public void as_aset_1403_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1403_LDataSet ds = null;
		AS_ASET_1403_LDM dm = new AS_ASET_1403_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.ndduc_year = Util.checkString(req.getParameter("ndduc_year"));
		dm.ndduc_prd_clsf = Util.checkString(req.getParameter("ndduc_prd_clsf"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1403_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1403_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.ndduc_year = (String)hash.get("ndduc_year");
		dm.ndduc_prd_clsf = (String)hash.get("ndduc_prd_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.ndduc_year = Util.getSessionParameterValue(req,"ndduc_year",true);
		dm.ndduc_prd_clsf = Util.getSessionParameterValue(req,"ndduc_prd_clsf",true);
		*******************************************************************************************/
	}

	public void as_aset_1404_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1404_IDataSet ds = null;
		AS_ASET_1404_IDM dm = new AS_ASET_1404_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData1"));
		System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.ndduc_year = Util.checkString(req.getParameter("ndduc_year"));
		dm.ndduc_prd_clsf = Util.checkString(req.getParameter("ndduc_prd_clsf"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.acct_cd = (String)hash.get("acct_cd");
		dm.ndduc_rate = (String)hash.get("ndduc_rate");
		dm.ndduc_amt = (String)hash.get("ndduc_amt");
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1404_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1404_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.ndduc_year = (String)hash.get("ndduc_year");
		dm.ndduc_prd_clsf = (String)hash.get("ndduc_prd_clsf");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.acct_cd = (String)hash.get("acct_cd");
		dm.ndduc_rate = (String)hash.get("ndduc_rate");
		dm.ndduc_amt = (String)hash.get("ndduc_amt");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.ndduc_year = Util.getSessionParameterValue(req,"ndduc_year",true);
		dm.ndduc_prd_clsf = Util.getSessionParameterValue(req,"ndduc_prd_clsf",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.acct_cd = Util.getSessionParameterValue(req,"acct_cd",true);
		dm.ndduc_rate = Util.getSessionParameterValue(req,"ndduc_rate",true);
		dm.ndduc_amt = Util.getSessionParameterValue(req,"ndduc_amt",true);
		*******************************************************************************************/
	}

	public void as_aset_1405_d(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1405_DDataSet ds = null;
		AS_ASET_1405_DDM dm = new AS_ASET_1405_DDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.ndduc_year = Util.checkString(req.getParameter("ndduc_year"));
		dm.ndduc_prd_clsf = Util.checkString(req.getParameter("ndduc_prd_clsf"));
		dm.chg_pers = Util.checkString(req.getParameter("chg_pers"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1405_DDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1405_d(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.ndduc_year = (String)hash.get("ndduc_year");
		dm.ndduc_prd_clsf = (String)hash.get("ndduc_prd_clsf");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.ndduc_year = Util.getSessionParameterValue(req,"ndduc_year",true);
		dm.ndduc_prd_clsf = Util.getSessionParameterValue(req,"ndduc_prd_clsf",true);
		*******************************************************************************************/
	}
	
	public void as_aset_1500_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1500_MDataSet ds = null;
		AS_ASET_1500_MDM dm = new AS_ASET_1500_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1500_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
	}

	public void as_aset_1501_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1501_LDataSet ds = null;
		AS_ASET_1501_LDM dm = new AS_ASET_1501_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1501_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */
		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1501_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/
	}

	public void as_aset_1502_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1502_LDataSet ds = null;
		AS_ASET_1502_LDM dm = new AS_ASET_1502_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));		
		dm.aset_no_list = Util.checkString(req.getParameter("aset_no_list"));

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1502_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */		
		
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1502_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_dt = (String)hash.get("chg_dt");		
		dm.aset_no_list = (String)hash.get("aset_no_list");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_dt = Util.getSessionParameterValue(req,"chg_dt",true);		
		dm.aset_no_list = Util.getSessionParameterValue(req,"aset_no_list",true);
		*******************************************************************************************/
	}

	public void as_aset_1503_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1503_IDataSet ds = null;
		AS_ASET_1503_IDM dm = new AS_ASET_1503_IDM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
		System.out.println(multiUpdateData);
		System.out.println(multiUpdateData1);
		System.out.println(multiUpdateData2);
		System.out.println(multiUpdateData3);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
		Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.tax_stmt_no = Util.checkString(req.getParameter("tax_stmt_no"));
		dm.draft_doc_no2 = Util.checkString(req.getParameter("draft_doc_no2"));

		dm.aset_no = Util.checkString((String)hash.get("aset_no"));
		dm.chg_amt = Util.checkString((String)hash.get("chg_amt"));
		dm.chg_vat_amt = Util.checkString((String)hash.get("chg_vat_amt"));
		dm.sale_now_acqr_amt = Util.checkString((String)hash.get("sale_now_acqr_amt"));
		dm.sale_redm_tot_amt = Util.checkString((String)hash.get("sale_redm_tot_amt"));
		dm.sale_un_redm_amt = Util.checkString((String)hash.get("sale_un_redm_amt"));
		dm.sale_pfls_amt = Util.checkString((String)hash.get("sale_pfls_amt"));
		dm.budg_cd = Util.checkString((String)hash.get("budg_cd"));
		dm.dtls_remk = Util.checkString((String)hash.get("dtls_remk"));

		dm.rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));

		dm.cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
		dm.cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));
		
		dm.deps_mode = Util.checkString((String)hash1.get("m")).toUpperCase();
		dm.deps_sub_seq = Util.checkString((String)hash1.get("deps_sub_seq"));
		dm.deps_rcpm_amt = Util.checkString((String)hash1.get("deps_rcpm_amt"));
		dm.deps_rmtt_dt = Util.checkString((String)hash1.get("deps_rmtt_dt"));
		dm.deps_rmtt_plac = Util.checkString((String)hash1.get("deps_rmtt_plac"));
		dm.deps_acct_mang_no = Util.checkString((String)hash1.get("deps_acct_mang_no"));
		dm.deps_coms_amt = Util.checkString((String)hash1.get("deps_coms_amt"));
		dm.deps_biz_reg_no = Util.checkString((String)hash1.get("deps_biz_reg_no"));
		dm.deps_bank_id = Util.checkString((String)hash1.get("deps_bank_id"));
		dm.deps_acct_num = Util.checkString((String)hash1.get("deps_acct_num"));
		dm.deps_tran_date = Util.checkString((String)hash1.get("deps_tran_date"));
		dm.deps_tran_date_seq = Util.checkString((String)hash1.get("deps_tran_date_seq"));
		
		dm.note_mode = Util.checkString((String)hash2.get("m")).toUpperCase();
		dm.note_sub_seq = Util.checkString((String)hash2.get("note_sub_seq"));
		dm.note_bank_cd = Util.checkString((String)hash2.get("note_bank_cd"));
		dm.note_note_no = Util.checkString((String)hash2.get("note_note_no"));
		dm.note_note_clsf_cd = Util.checkString((String)hash2.get("note_note_clsf_cd"));
		dm.note_comp_dt = Util.checkString((String)hash2.get("note_comp_dt"));
		dm.note_mtry_dt = Util.checkString((String)hash2.get("note_mtry_dt"));
		dm.note_rcpm_amt = Util.checkString((String)hash2.get("note_rcpm_amt"));
		dm.note_issu_cmpy_clsf = Util.checkString((String)hash2.get("note_issu_cmpy_clsf"));
		dm.note_issu_pers_nm = Util.checkString((String)hash2.get("note_issu_pers_nm"));
		dm.note_rcpm_acct = Util.checkString((String)hash2.get("note_rcpm_acct"));
		dm.note_sale_aprv_no = Util.checkString((String)hash2.get("note_sale_aprv_no"));
		
		dm.etc_mode = Util.checkString((String)hash3.get("m")).toUpperCase();
		dm.etc_sub_seq = Util.checkString((String)hash3.get("etc_sub_seq"));
		dm.etc_budg_cd = Util.checkString((String)hash3.get("etc_budg_cd"));
		dm.etc_rcpm_amt = Util.checkString((String)hash3.get("etc_rcpm_amt"));
		dm.etc_bal_occr_slip_clsf = Util.checkString((String)hash3.get("etc_bal_occr_slip_clsf"));
		dm.etc_bal_occr_slip_no = Util.checkString((String)hash3.get("etc_bal_occr_slip_no"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1503_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1503_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_dt = (String)hash.get("chg_dt");
		dm.remk = (String)hash.get("remk");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_ern = (String)hash.get("dlco_ern");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.tax_stmt_no = (String)hash.get("tax_stmt_no");
		dm.draft_doc_no2 = (String)hash.get("draft_doc_no2");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.aset_no = (String)hash.get("aset_no");
		dm.chg_amt = (String)hash.get("chg_amt");
		dm.chg_vat_amt = (String)hash.get("chg_vat_amt");
		dm.sale_now_acqr_amt = (String)hash.get("sale_now_acqr_amt");
		dm.sale_redm_tot_amt = (String)hash.get("sale_redm_tot_amt");
		dm.sale_un_redm_amt = (String)hash.get("sale_un_redm_amt");
		dm.sale_pfls_amt = (String)hash.get("sale_pfls_amt");
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_dt = Util.getSessionParameterValue(req,"chg_dt",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_ern = Util.getSessionParameterValue(req,"dlco_ern",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.tax_stmt_no = Util.getSessionParameterValue(req,"tax_stmt_no",true);
		dm.draft_doc_no2 = Util.getSessionParameterValue(req,"draft_doc_no2",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		dm.chg_amt = Util.getSessionParameterValue(req,"chg_amt",true);
		dm.chg_vat_amt = Util.getSessionParameterValue(req,"chg_vat_amt",true);
		dm.sale_now_acqr_amt = Util.getSessionParameterValue(req,"sale_now_acqr_amt",true);
		dm.sale_redm_tot_amt = Util.getSessionParameterValue(req,"sale_redm_tot_amt",true);
		dm.sale_un_redm_amt = Util.getSessionParameterValue(req,"sale_un_redm_amt",true);
		dm.sale_pfls_amt = Util.getSessionParameterValue(req,"sale_pfls_amt",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}

	public void as_aset_1504_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1504_ADataSet ds = null;
		AS_ASET_1504_ADM dm = new AS_ASET_1504_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
		System.out.println(multiUpdateData);
		System.out.println(multiUpdateData1);
		System.out.println(multiUpdateData2);
		System.out.println(multiUpdateData3);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
		Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpycd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"deptcd",true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"emp_no",true);

		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
		dm.chg_tot_amt = Util.checkString(req.getParameter("chg_tot_amt"));
		dm.slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
		dm.slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
		dm.slip_seq = Util.checkString(req.getParameter("slip_seq"));
		dm.tax_stmt_no = Util.checkString(req.getParameter("tax_stmt_no"));
		dm.draft_doc_no2 = Util.checkString(req.getParameter("draft_doc_no2"));
		
		dm.mode = Util.checkString((String)hash.get("m")).toUpperCase();
		dm.sub_seq = Util.checkString((String)hash.get("sub_seq"));
		dm.aset_no = Util.checkString((String)hash.get("aset_no"));
		dm.chg_amt = Util.checkString((String)hash.get("chg_amt"));
		dm.chg_vat_amt = Util.checkString((String)hash.get("chg_vat_amt"));
		dm.sale_now_acqr_amt = Util.checkString((String)hash.get("sale_now_acqr_amt"));
		dm.sale_redm_tot_amt = Util.checkString((String)hash.get("sale_redm_tot_amt"));
		dm.sale_un_redm_amt = Util.checkString((String)hash.get("sale_un_redm_amt"));
		dm.sale_pfls_amt = Util.checkString((String)hash.get("sale_pfls_amt"));
		dm.budg_cd = Util.checkString((String)hash.get("budg_cd"));
		dm.dtls_remk = Util.checkString((String)hash.get("dtls_remk"));

		dm.rcpm_amt = Util.checkString(req.getParameter("rcpm_amt"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));

		dm.cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
		dm.cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));
		
		dm.deps_mode = Util.checkString((String)hash1.get("m")).toUpperCase();
		dm.deps_sub_seq = Util.checkString((String)hash1.get("deps_sub_seq"));
		dm.deps_rcpm_amt = Util.checkString((String)hash1.get("deps_rcpm_amt"));
		dm.deps_rmtt_dt = Util.checkString((String)hash1.get("deps_rmtt_dt"));
		dm.deps_rmtt_plac = Util.checkString((String)hash1.get("deps_rmtt_plac"));
		dm.deps_acct_mang_no = Util.checkString((String)hash1.get("deps_acct_mang_no"));
		dm.deps_coms_amt = Util.checkString((String)hash1.get("deps_coms_amt"));
		dm.deps_biz_reg_no = Util.checkString((String)hash1.get("deps_biz_reg_no"));
		dm.deps_bank_id = Util.checkString((String)hash1.get("deps_bank_id"));
		dm.deps_acct_num = Util.checkString((String)hash1.get("deps_acct_num"));
		dm.deps_tran_date = Util.checkString((String)hash1.get("deps_tran_date"));
		dm.deps_tran_date_seq = Util.checkString((String)hash1.get("deps_tran_date_seq"));
		
		dm.note_mode = Util.checkString((String)hash2.get("m")).toUpperCase();
		dm.note_sub_seq = Util.checkString((String)hash2.get("note_sub_seq"));
		dm.note_bank_cd = Util.checkString((String)hash2.get("note_bank_cd"));
		dm.note_note_no = Util.checkString((String)hash2.get("note_note_no"));
		dm.note_note_clsf_cd = Util.checkString((String)hash2.get("note_note_clsf_cd"));
		dm.note_comp_dt = Util.checkString((String)hash2.get("note_comp_dt"));
		dm.note_mtry_dt = Util.checkString((String)hash2.get("note_mtry_dt"));
		dm.note_rcpm_amt = Util.checkString((String)hash2.get("note_rcpm_amt"));
		dm.note_issu_cmpy_clsf = Util.checkString((String)hash2.get("note_issu_cmpy_clsf"));
		dm.note_issu_pers_nm = Util.checkString((String)hash2.get("note_issu_pers_nm"));
		dm.note_rcpm_acct = Util.checkString((String)hash2.get("note_rcpm_acct"));
		dm.note_sale_aprv_no = Util.checkString((String)hash2.get("note_sale_aprv_no"));
		
		dm.etc_mode = Util.checkString((String)hash3.get("m")).toUpperCase();
		dm.etc_sub_seq = Util.checkString((String)hash3.get("etc_sub_seq"));
		dm.etc_budg_cd = Util.checkString((String)hash3.get("etc_budg_cd"));
		dm.etc_rcpm_amt = Util.checkString((String)hash3.get("etc_rcpm_amt"));
		dm.etc_bal_occr_slip_clsf = Util.checkString((String)hash3.get("etc_bal_occr_slip_clsf"));
		dm.etc_bal_occr_slip_no = Util.checkString((String)hash3.get("etc_bal_occr_slip_no"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1504_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
			
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1504_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.chg_dt = (String)hash.get("chg_dt");
		dm.remk = (String)hash.get("remk");
		dm.dlco_clsf_cd = (String)hash.get("dlco_clsf_cd");
		dm.dlco_ern = (String)hash.get("dlco_ern");
		dm.chg_tot_amt = (String)hash.get("chg_tot_amt");
		dm.slip_occr_dt = (String)hash.get("slip_occr_dt");
		dm.slip_clsf_cd = (String)hash.get("slip_clsf_cd");
		dm.slip_seq = (String)hash.get("slip_seq");
		dm.tax_stmt_no = (String)hash.get("tax_stmt_no");
		dm.draft_doc_no2 = (String)hash.get("draft_doc_no2");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.mode = (String)hash.get("mode");
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.aset_no = (String)hash.get("aset_no");
		dm.chg_amt = (String)hash.get("chg_amt");
		dm.chg_vat_amt = (String)hash.get("chg_vat_amt");
		dm.sale_now_acqr_amt = (String)hash.get("sale_now_acqr_amt");
		dm.sale_redm_tot_amt = (String)hash.get("sale_redm_tot_amt");
		dm.sale_un_redm_amt = (String)hash.get("sale_un_redm_amt");
		dm.sale_pfls_amt = (String)hash.get("sale_pfls_amt");
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mst_mode = Util.getSessionParameterValue(req,"mst_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.chg_dt = Util.getSessionParameterValue(req,"chg_dt",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.dlco_clsf_cd = Util.getSessionParameterValue(req,"dlco_clsf_cd",true);
		dm.dlco_ern = Util.getSessionParameterValue(req,"dlco_ern",true);
		dm.chg_tot_amt = Util.getSessionParameterValue(req,"chg_tot_amt",true);
		dm.slip_occr_dt = Util.getSessionParameterValue(req,"slip_occr_dt",true);
		dm.slip_clsf_cd = Util.getSessionParameterValue(req,"slip_clsf_cd",true);
		dm.slip_seq = Util.getSessionParameterValue(req,"slip_seq",true);
		dm.tax_stmt_no = Util.getSessionParameterValue(req,"tax_stmt_no",true);
		dm.draft_doc_no2 = Util.getSessionParameterValue(req,"draft_doc_no2",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.sub_seq = Util.getSessionParameterValue(req,"sub_seq",true);
		dm.aset_no = Util.getSessionParameterValue(req,"aset_no",true);
		dm.chg_amt = Util.getSessionParameterValue(req,"chg_amt",true);
		dm.chg_vat_amt = Util.getSessionParameterValue(req,"chg_vat_amt",true);
		dm.sale_now_acqr_amt = Util.getSessionParameterValue(req,"sale_now_acqr_amt",true);
		dm.sale_redm_tot_amt = Util.getSessionParameterValue(req,"sale_redm_tot_amt",true);
		dm.sale_un_redm_amt = Util.getSessionParameterValue(req,"sale_un_redm_amt",true);
		dm.sale_pfls_amt = Util.getSessionParameterValue(req,"sale_pfls_amt",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}

	public void as_aset_1601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1601_LDataSet ds = null;
		AS_ASET_1601_LDM dm = new AS_ASET_1601_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));		
		dm.aset_no_list = Util.checkString(req.getParameter("aset_no_list"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1601_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */						
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1601_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_dt = (String)hash.get("chg_dt");
		dm.aset_no_list = (String)hash.get("aset_no_list");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.chg_dt = Util.getSessionParameterValue(req,"chg_dt",true);
		dm.aset_no_list = Util.getSessionParameterValue(req,"aset_no_list",true);
		*******************************************************************************************/
	}
	
	public void as_aset_1602_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1602_LDataSet ds = null;
		AS_ASET_1602_LDM dm = new AS_ASET_1602_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1602_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1602_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/
	}
	
	public void as_aset_1603_i(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1603_IDataSet ds = null;
		AS_ASET_1603_IDM dm = new AS_ASET_1603_IDM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println("==============================");
		System.out.println(multiUpdateData);
		System.out.println("==============================");
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.draft_doc_no2 = Util.checkString(req.getParameter("draft_doc_no2"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
				
		dm.aset_no = (String)hash.get("aset_no");
		dm.sale_now_acqr_amt = (String)hash.get("sale_now_acqr_amt");
		dm.sale_redm_tot_amt = (String)hash.get("sale_redm_tot_amt");
		dm.sale_un_redm_amt = (String)hash.get("sale_un_redm_amt");
		dm.sale_pfls_amt = (String)hash.get("sale_pfls_amt");
		dm.remk_dtls = (String)hash.get("remk_dtls");
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1603_IDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1603_i(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.chg_dt = (String)hash.get("chg_dt");
		dm.remk = (String)hash.get("remk");
		dm.draft_doc_no2 = (String)hash.get("draft_doc_no2");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.aset_no = (String)hash.get("aset_no");
		dm.sale_now_acqr_amt = (String)hash.get("sale_now_acqr_amt");
		dm.sale_redm_tot_amt = (String)hash.get("sale_redm_tot_amt");
		dm.sale_un_redm_amt = (String)hash.get("sale_un_redm_amt");
		dm.sale_pfls_amt = (String)hash.get("sale_pfls_amt");
		dm.remk_dtls = (String)hash.get("remk_dtls");
		*******************************************************************************************/
	}
	
	public void as_aset_1605_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1605_ADataSet ds = null;
		AS_ASET_1605_ADM dm = new AS_ASET_1605_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println("==============================");
		System.out.println(multiUpdateData);
		System.out.println("==============================");
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		dm.draft_doc_no2 = Util.checkString(req.getParameter("draft_doc_no2"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		
		dm.mode = ((String)hash.get("m")).toUpperCase();
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.aset_no = (String)hash.get("aset_no");
		dm.sale_now_acqr_amt = (String)hash.get("sale_now_acqr_amt");
		dm.sale_redm_tot_amt = (String)hash.get("sale_redm_tot_amt");
		dm.sale_un_redm_amt = (String)hash.get("sale_un_redm_amt");
		dm.sale_pfls_amt = (String)hash.get("sale_pfls_amt");
		dm.remk_dtls = (String)hash.get("remk_dtls");
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1605_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1605_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.chg_dt = (String)hash.get("chg_dt");
		dm.remk = (String)hash.get("remk");
		dm.draft_doc_no2 = (String)hash.get("draft_doc_no2");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.mode = (String)hash.get("mode");
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.aset_no = (String)hash.get("aset_no");
		dm.sale_now_acqr_amt = (String)hash.get("sale_now_acqr_amt");
		dm.sale_redm_tot_amt = (String)hash.get("sale_redm_tot_amt");
		dm.sale_un_redm_amt = (String)hash.get("sale_un_redm_amt");
		dm.sale_pfls_amt = (String)hash.get("sale_pfls_amt");
		dm.remk_dtls = (String)hash.get("remk_dtls");
		*******************************************************************************************/
	}
	
	public void as_aset_1701_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1701_MDataSet ds = null;
		AS_ASET_1701_MDM dm = new AS_ASET_1701_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"emp_no",true);
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1701_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
				
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1701_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

	public void as_aset_1702_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1702_LDataSet ds = null;
		AS_ASET_1702_LDM dm = new AS_ASET_1702_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.rcpm_dt_fr = Util.checkString(req.getParameter("rcpm_dt_fr"));
		dm.rcpm_dt_to = Util.checkString(req.getParameter("rcpm_dt_to"));
		dm.dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
		dm.remk = Util.checkString(req.getParameter("remk"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1702_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
			
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1702_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpm_dt_fr = (String)hash.get("rcpm_dt_fr");
		dm.rcpm_dt_to = (String)hash.get("rcpm_dt_to");
		dm.dlco_ern = (String)hash.get("dlco_ern");
		dm.remk = (String)hash.get("remk");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.rcpm_dt_fr = Util.getSessionParameterValue(req,"rcpm_dt_fr",true);
		dm.rcpm_dt_to = Util.getSessionParameterValue(req,"rcpm_dt_to",true);
		dm.dlco_ern = Util.getSessionParameterValue(req,"dlco_ern",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		*******************************************************************************************/
	}

	public void as_aset_1703_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1703_LDataSet ds = null;
		AS_ASET_1703_LDM dm = new AS_ASET_1703_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1703_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
				
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1703_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}

	public void as_aset_1704_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1704_LDataSet ds = null;
		AS_ASET_1704_LDM dm = new AS_ASET_1704_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
//		dm.print();
		
		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1704_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
	
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1704_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		*******************************************************************************************/
	}

	public void as_aset_1705_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1705_ADataSet ds = null;
		AS_ASET_1705_ADM dm = new AS_ASET_1705_ADM();

		String multiUpdateData1 = Util.checkString(req.getParameter("multiUpdateData1"));
		String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData2"));
		String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData3"));
		System.out.println(multiUpdateData1);
		System.out.println(multiUpdateData2);
		System.out.println(multiUpdateData3);
		Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);
		Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
		Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);


		dm.mst_mode = Util.checkString(req.getParameter("mst_mode"));
		
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.rcpm_dt = Util.checkString(req.getParameter("rcpm_dt")); 
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.rcpm_shet_no = Util.checkString(req.getParameter("rcpm_shet_no"));
		dm.ref_occr_dt = Util.checkString(req.getParameter("ref_occr_dt"));
		dm.ref_occr_seq = Util.checkString(req.getParameter("ref_occr_seq"));
		dm.dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
		dm.dlco_ern = Util.checkString(req.getParameter("dlco_ern"));
		dm.remk = Util.checkString(req.getParameter("remk"));
		
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		
		dm.cash_sub_seq = Util.checkString(req.getParameter("cash_sub_seq"));
		dm.cash_rcpm_amt = Util.checkString(req.getParameter("cash_rcpm_amt"));
		
		dm.deps_mode = Util.checkString((String)hash1.get("m")).toUpperCase();
		dm.deps_sub_seq = Util.checkString((String)hash1.get("deps_sub_seq"));
		dm.deps_rcpm_amt = Util.checkString((String)hash1.get("deps_rcpm_amt"));
		dm.deps_rmtt_dt = Util.checkString((String)hash1.get("deps_rmtt_dt"));
		dm.deps_rmtt_plac = Util.checkString((String)hash1.get("deps_rmtt_plac"));
		dm.deps_acct_mang_no = Util.checkString((String)hash1.get("deps_acct_mang_no"));
		dm.deps_coms_amt = Util.checkString((String)hash1.get("deps_coms_amt"));
		dm.deps_biz_reg_no = Util.checkString((String)hash1.get("deps_biz_reg_no"));
		dm.deps_bank_id = Util.checkString((String)hash1.get("deps_bank_id"));
		dm.deps_acct_num = Util.checkString((String)hash1.get("deps_acct_num"));
		dm.deps_tran_date = Util.checkString((String)hash1.get("deps_tran_date"));
		dm.deps_tran_date_seq = Util.checkString((String)hash1.get("deps_tran_date_seq"));
		
		dm.note_mode = Util.checkString((String)hash2.get("m")).toUpperCase();
		dm.note_sub_seq = Util.checkString((String)hash2.get("note_sub_seq"));
		dm.note_bank_cd = Util.checkString((String)hash2.get("note_bank_cd"));
		dm.note_note_no = Util.checkString((String)hash2.get("note_note_no"));
		dm.note_note_clsf_cd = Util.checkString((String)hash2.get("note_note_clsf_cd"));
		dm.note_comp_dt = Util.checkString((String)hash2.get("note_comp_dt"));
		dm.note_mtry_dt = Util.checkString((String)hash2.get("note_mtry_dt"));
		dm.note_rcpm_amt = Util.checkString((String)hash2.get("note_rcpm_amt"));
		dm.note_issu_cmpy_clsf = Util.checkString((String)hash2.get("note_issu_cmpy_clsf"));
		dm.note_issu_pers_nm = Util.checkString((String)hash2.get("note_issu_pers_nm"));
		dm.note_rcpm_acct = Util.checkString((String)hash2.get("note_rcpm_acct"));
		dm.note_sale_aprv_no = Util.checkString((String)hash2.get("note_sale_aprv_no"));
		
		dm.etc_mode = Util.checkString((String)hash3.get("m")).toUpperCase();
		dm.etc_sub_seq = Util.checkString((String)hash3.get("etc_sub_seq"));
		dm.etc_budg_cd = Util.checkString((String)hash3.get("etc_budg_cd"));
		dm.etc_rcpm_amt = Util.checkString((String)hash3.get("etc_rcpm_amt"));
		dm.etc_bal_occr_slip_clsf = Util.checkString((String)hash3.get("etc_bal_occr_slip_clsf"));
		dm.etc_bal_occr_slip_no = Util.checkString((String)hash3.get("etc_bal_occr_slip_no"));
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1705_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
			
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1705_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mst_mode = (String)hash.get("mst_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.rcpm_dt = (String)hash.get("rcpm_dt");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.rcpm_shet_no = (String)hash.get("rcpm_shet_no");
		dm.ref_occr_dt = (String)hash.get("ref_occr_dt");
		dm.ref_occr_seq = (String)hash.get("ref_occr_seq");
		dm.remk = (String)hash.get("remk");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.cash_sub_seq = (String)hash.get("cash_sub_seq");
		dm.cash_rcpm_amt = (String)hash.get("cash_rcpm_amt");
		dm.deps_mode = (String)hash.get("deps_mode");
		dm.deps_sub_seq = (String)hash.get("deps_sub_seq");
		dm.deps_rcpm_amt = (String)hash.get("deps_rcpm_amt");
		dm.deps_rmtt_dt = (String)hash.get("deps_rmtt_dt");
		dm.deps_rmtt_plac = (String)hash.get("deps_rmtt_plac");
		dm.deps_acct_mang_no = (String)hash.get("deps_acct_mang_no");
		dm.deps_coms_amt = (String)hash.get("deps_coms_amt");
		dm.note_mode = (String)hash.get("note_mode");
		dm.note_sub_seq = (String)hash.get("note_sub_seq");
		dm.note_bank_cd = (String)hash.get("note_bank_cd");
		dm.note_note_no = (String)hash.get("note_note_no");
		dm.note_note_clsf_cd = (String)hash.get("note_note_clsf_cd");
		dm.note_comp_dt = (String)hash.get("note_comp_dt");
		dm.note_mtry_dt = (String)hash.get("note_mtry_dt");
		dm.note_rcpm_amt = (String)hash.get("note_rcpm_amt");
		dm.note_issu_cmpy_clsf = (String)hash.get("note_issu_cmpy_clsf");
		dm.note_issu_pers_nm = (String)hash.get("note_issu_pers_nm");
		dm.note_rcpm_acct = (String)hash.get("note_rcpm_acct");
		dm.note_sale_aprv_no = (String)hash.get("note_sale_aprv_no");
		dm.etc_mode = (String)hash.get("etc_mode");
		dm.etc_sub_seq = (String)hash.get("etc_sub_seq");
		dm.etc_budg_cd = (String)hash.get("etc_budg_cd");
		dm.etc_rcpm_amt = (String)hash.get("etc_rcpm_amt");
		dm.etc_bal_occr_slip_clsf = (String)hash.get("etc_bal_occr_slip_clsf");
		dm.etc_bal_occr_slip_no = (String)hash.get("etc_bal_occr_slip_no");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mst_mode = Util.getSessionParameterValue(req,"mst_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.rcpm_dt = Util.getSessionParameterValue(req,"rcpm_dt",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.rcpm_shet_no = Util.getSessionParameterValue(req,"rcpm_shet_no",true);
		dm.ref_occr_dt = Util.getSessionParameterValue(req,"ref_occr_dt",true);
		dm.ref_occr_seq = Util.getSessionParameterValue(req,"ref_occr_seq",true);
		dm.remk = Util.getSessionParameterValue(req,"remk",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		dm.cash_sub_seq = Util.getSessionParameterValue(req,"cash_sub_seq",true);
		dm.cash_rcpm_amt = Util.getSessionParameterValue(req,"cash_rcpm_amt",true);
		dm.deps_mode = Util.getSessionParameterValue(req,"deps_mode",true);
		dm.deps_sub_seq = Util.getSessionParameterValue(req,"deps_sub_seq",true);
		dm.deps_rcpm_amt = Util.getSessionParameterValue(req,"deps_rcpm_amt",true);
		dm.deps_rmtt_dt = Util.getSessionParameterValue(req,"deps_rmtt_dt",true);
		dm.deps_rmtt_plac = Util.getSessionParameterValue(req,"deps_rmtt_plac",true);
		dm.deps_acct_mang_no = Util.getSessionParameterValue(req,"deps_acct_mang_no",true);
		dm.deps_coms_amt = Util.getSessionParameterValue(req,"deps_coms_amt",true);
		dm.note_mode = Util.getSessionParameterValue(req,"note_mode",true);
		dm.note_sub_seq = Util.getSessionParameterValue(req,"note_sub_seq",true);
		dm.note_bank_cd = Util.getSessionParameterValue(req,"note_bank_cd",true);
		dm.note_note_no = Util.getSessionParameterValue(req,"note_note_no",true);
		dm.note_note_clsf_cd = Util.getSessionParameterValue(req,"note_note_clsf_cd",true);
		dm.note_comp_dt = Util.getSessionParameterValue(req,"note_comp_dt",true);
		dm.note_mtry_dt = Util.getSessionParameterValue(req,"note_mtry_dt",true);
		dm.note_rcpm_amt = Util.getSessionParameterValue(req,"note_rcpm_amt",true);
		dm.note_issu_cmpy_clsf = Util.getSessionParameterValue(req,"note_issu_cmpy_clsf",true);
		dm.note_issu_pers_nm = Util.getSessionParameterValue(req,"note_issu_pers_nm",true);
		dm.note_rcpm_acct = Util.getSessionParameterValue(req,"note_rcpm_acct",true);
		dm.note_sale_aprv_no = Util.getSessionParameterValue(req,"note_sale_aprv_no",true);
		dm.etc_mode = Util.getSessionParameterValue(req,"etc_mode",true);
		dm.etc_sub_seq = Util.getSessionParameterValue(req,"etc_sub_seq",true);
		dm.etc_budg_cd = Util.getSessionParameterValue(req,"etc_budg_cd",true);
		dm.etc_rcpm_amt = Util.getSessionParameterValue(req,"etc_rcpm_amt",true);
		dm.etc_bal_occr_slip_clsf = Util.getSessionParameterValue(req,"etc_bal_occr_slip_clsf",true);
		dm.etc_bal_occr_slip_no = Util.getSessionParameterValue(req,"etc_bal_occr_slip_no",true);
		*******************************************************************************************/
	}

	public void as_aset_1708_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1708_ADataSet ds = null;
		AS_ASET_1708_ADM dm = new AS_ASET_1708_ADM();

		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println(multiUpdateData);
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.job_mode = Util.checkString(req.getParameter("job_mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.dept_cd = Util.getSessionParameterValue(req, "deptcd", true);
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_clsf = Util.checkString(req.getParameter("chg_clsf"));

		dm.occr_dt = Util.checkString((String)hash.get("occr_dt"));
		dm.occr_seq = Util.checkString((String)hash.get("occr_seq"));
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1708_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
			
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1708_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.job_mode = (String)hash.get("job_mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.dept_cd = (String)hash.get("dept_cd");
		dm.chg_clsf = (String)hash.get("chg_clsf");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.job_mode = Util.getSessionParameterValue(req,"job_mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.dept_cd = Util.getSessionParameterValue(req,"dept_cd",true);
		dm.chg_clsf = Util.getSessionParameterValue(req,"chg_clsf",true);
		dm.occr_dt = Util.getSessionParameterValue(req,"occr_dt",true);
		dm.occr_seq = Util.getSessionParameterValue(req,"occr_seq",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}

	public void as_aset_1709_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1709_LDataSet ds = null;
		AS_ASET_1709_LDM dm = new AS_ASET_1709_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.budg_cd = Util.checkString(req.getParameter("budg_cd"));

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1709_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
					
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1709_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.budg_cd = (String)hash.get("budg_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.budg_cd = Util.getSessionParameterValue(req,"budg_cd",true);
		*******************************************************************************************/
	}

	
	public void as_aset_1801_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1801_LDataSet ds = null;
		AS_ASET_1801_LDM dm = new AS_ASET_1801_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1801_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */	
									
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1801_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	public void as_aset_1802_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1802_ADataSet ds = null;
		AS_ASET_1802_ADM dm = new AS_ASET_1802_ADM();

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.close_yymm = Util.checkString(req.getParameter("close_yymm"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1802_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
		
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1802_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.close_yymm = (String)hash.get("close_yymm");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.mode = Util.getSessionParameterValue(req,"mode",true);
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.close_yymm = Util.getSessionParameterValue(req,"close_yymm",true);
		dm.incmg_pers_ipadd = Util.getSessionParameterValue(req,"incmg_pers_ipadd",true);
		dm.incmg_pers = Util.getSessionParameterValue(req,"incmg_pers",true);
		dm.chg_pers = Util.getSessionParameterValue(req,"chg_pers",true);
		*******************************************************************************************/
	}

	public void as_aset_1901_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1901_LDataSet ds = null;
		AS_ASET_1901_LDM dm = new AS_ASET_1901_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1901_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
				
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1901_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
	
	public void as_aset_1902_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1902_LDataSet ds = null;
		AS_ASET_1902_LDM dm = new AS_ASET_1902_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1902_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
						
/*
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1902_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}

	public void as_aset_1903_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1903_LDataSet ds = null;
		AS_ASET_1903_LDM dm = new AS_ASET_1903_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.base_dt = Util.checkString(req.getParameter("base_dt"));
		dm.eis_aset_clsf = Util.checkString(req.getParameter("eis_aset_clsf"));
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1903_LDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
				
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1903_l(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.base_dt = (String)hash.get("base_dt");
		dm.eis_aset_clsf = (String)hash.get("eis_aset_clsf");	
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		dm.base_dt = Util.getSessionParameterValue(req,"base_dt",true);
		dm.eis_aset_clsf = Util.getSessionParameterValue(req,"eis_aset_clsf",true);		
		*******************************************************************************************/
	}	


	public void as_aset_1904_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1904_ADataSet ds = null;
		AS_ASET_1904_ADM dm = new AS_ASET_1904_ADM();
		
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		System.out.println("==============================================================");
		System.out.println(multiUpdateData);
		System.out.println("==============================================================");
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = Util.checkString(req.getParameter("mode"));
		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.occr_seq = Util.checkString(req.getParameter("occr_seq"));
		dm.chg_dt = Util.checkString(req.getParameter("chg_dt"));
		dm.incmg_pers_ipadd = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);
		dm.chg_pers = Util.getSessionParameterValue(req, "emp_no", true);		
		dm.aset_no = (String)hash.get("aset_no");
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.basi_mrkt_pric = (String)hash.get("basi_mrkt_pric");
		
//		dm.print();

		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1904_ADataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */			
			
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1904_a(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.mode = (String)hash.get("mode");
		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		dm.occr_dt = (String)hash.get("occr_dt");
		dm.occr_seq = (String)hash.get("occr_seq");
		dm.chg_dt = (String)hash.get("chg_dt");
		dm.incmg_pers_ipadd = (String)hash.get("incmg_pers_ipadd");
		dm.incmg_pers = (String)hash.get("incmg_pers");
		dm.chg_pers = (String)hash.get("chg_pers");
		dm.sub_seq = (String)hash.get("sub_seq");
		dm.aset_no = (String)hash.get("aset_no");
		dm.basi_mrkt_pric = (String)hash.get("basi_mrkt_pric");
		*******************************************************************************************/
	}

	public void as_aset_1906_m(HttpServletRequest req, HttpServletResponse res) throws AppException {
		AS_ASET_1906_MDataSet ds = null;
		AS_ASET_1906_MDM dm = new AS_ASET_1906_MDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

//		dm.print();


		/* EJB 수정후 시작 */
		DBManager manager = new DBManager("MISAST");
		ds = (AS_ASET_1906_MDataSet)manager.executeCall(dm);

		if(!ds.getErrcode().equals("")) {
			throw new AppException(ds.getErrcode(), ds.getErrmsg());
		}

		req.setAttribute("ds", ds);
		/* EJB 수정후 끝 */					
/*		
		try {
			AS_ASET_1000EJBHome home = (AS_ASET_1000EJBHome)JNDIManager.getInstance().getHome("AS_ASET_1000EJB");
			AS_ASET_1000EJB ejb = home.create();

			ds = ejb.as_aset_1906_m(dm);
			req.setAttribute("ds", ds);
		}
		catch (CreateException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
		catch (RemoteException e) {
			SysException se = new SysException(e);
			LogManager.getInstance().log(se);
			throw se;
		}
*/
		/*******************************************************************************************
		String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
		Hashtable hash = getHashMultiUpdateData(multiUpdateData);

		dm.cmpy_cd = (String)hash.get("cmpy_cd");
		*******************************************************************************************/

		/*******************************************************************************************
		dm.cmpy_cd = Util.getSessionParameterValue(req,"cmpy_cd",true);
		*******************************************************************************************/
	}
}

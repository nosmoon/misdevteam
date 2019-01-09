package chosun.ciis.mt.submatrout.wb;

import java.rmi.RemoteException;

import javax.ejb.CreateException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import somo.framework.expt.AppException;
import somo.framework.expt.SysException;
import somo.framework.lib.JNDIManager;
import somo.framework.log.LogManager;
import somo.framework.util.Util;
import somo.framework.db.BaseDataSet;
import somo.framework.db.DBManager;
import chosun.ciis.co.base.wb.BaseWB;
import java.util.Hashtable;

import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

public class MT_SUBMATROUT_1000WB extends BaseWB {

    /**
     * 멀티레코드처리 row 구분자
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * 멀티레코드처리 column 구분자
     */
    public final String COL_SEPARATOR = "#";


    /**
     * TAB 1 부재료출고 화면 셋팅
     */
    public void mt_submatrout_1100(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1100_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1100_LDM dm = new MT_SUBMATROUT_1100_LDM();

    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setEwh_dt(Util.checkString(req.getParameter("owh_dt")));
   	    dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
   	    dm.print();

    	ds = (MT_SUBMATROUT_1100_LDataSet) manager.executeCall(dm);

    	if (!"".equals(ds.errcode)) {
    		System.out.println("DAO..error.");
    		throw new AppException(ds.errcode, ds.errmsg);
    	}

    	req.setAttribute("ds", ds);

    }

    public void mt_submatrout_1101(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1101_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1101_LDM dm = new MT_SUBMATROUT_1101_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
   	    dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();

    	ds = (MT_SUBMATROUT_1101_LDataSet) manager.executeCall(dm);
    	if (!"".equals(ds.errcode)) {
    		System.out.println("DAO..error.");
    		throw new AppException(ds.errcode, ds.errmsg);
    	}

    	req.setAttribute("ds", ds);
    }

    /**
     * TAB 1 부재료출고 현재고 조회
     */
    public void mt_submatrout_1102(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1102_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1102_LDM dm = new MT_SUBMATROUT_1102_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setEwh_dt(Util.checkString(req.getParameter("owh_dt")));
   	    dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
   	    dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();

        ds = (MT_SUBMATROUT_1102_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }
    	req.setAttribute("ds", ds);
    }

    /**
     * TAB 1 부재료출고 내역 조회
     */
    public void mt_submatrout_1103(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1103_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1103_LDM dm = new MT_SUBMATROUT_1103_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.setOwh_deptcd(Util.checkString(req.getParameter("dept_cd")));
    	dm.setOwh_dt_fr(Util.checkString(req.getParameter("owh_dt_fr")));
    	dm.setOwh_dt_to(Util.checkString(req.getParameter("owh_dt_to")));
    	dm.print();

    	ds = (MT_SUBMATROUT_1103_LDataSet) manager.executeCall(dm);

    	if (!"".equals(ds.errcode)) {
    		System.out.println("DAO..error.");
    		throw new AppException(ds.errcode, ds.errmsg);
    	}

    	req.setAttribute("ds", ds);
    }


    /**
     * TAB 1 부재료출고 상세 내역 조회
     */
    public void mt_submatrout_1104(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1104_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1104_LDM dm = new MT_SUBMATROUT_1104_LDM();
    	dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
    	dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
    	dm.setSeq(Util.checkString(req.getParameter("seq")));
    	dm.print();

    	ds = (MT_SUBMATROUT_1104_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public String muliUpdateDataSum(int gubun, String str1, String str2) {
        String tarGet1 = str1;
        String tarGet2 = str2;
        String SumStr  = "";

        if( (!tarGet1.equals("")) && (!tarGet2.equals("")))   //str1이 존재 하고 str2가 존재 할때
        {
        	SumStr = tarGet1 + "#" + tarGet2;
        }
        else if((!tarGet1.equals("")) && (tarGet2.equals(""))) //str1이 존재 하고 str2 값이 없을때
        {
        	if( gubun == 1 )
        	           SumStr = tarGet1 + "#";
        	else if(gubun == 2)
        		       SumStr = tarGet1;
        }
        else if((tarGet1.equals("")) && (!tarGet2.equals(""))) //str1이 값이 없고 str2 값이 있을때
        {
        	if( gubun == 1 )
        	           SumStr = "#" + tarGet2;
        	else if(gubun == 3 )
        		       SumStr =  tarGet2;
        }
        else if((tarGet1.equals("")) && (tarGet2.equals("")))  //str1값이 없고 str2도 값이 없을때
        {
        	if( gubun == 1 )
        		         SumStr = "#";
        }

        return (SumStr);
    }
    /**
     * TAB 1 부재료출고 내역 등록
     */
    public void mt_submatrout_1109(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1109_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1109_ADM dm = new MT_SUBMATROUT_1109_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setOwh_dt(Util.checkString(req.getParameter("owh_dt")));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
   	    dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
   	    dm.setPers_ipaddr(req.getRemoteAddr());
   	    dm.setWorktype(Util.checkString(req.getParameter("p_gubun")));
   	    String p_gubun = Util.checkString(req.getParameter("p_gubun"));
   	    dm.setOwh_dept(Util.checkString(req.getParameter("dept_cd")));
   	    dm.setHead_remk(Util.checkString(req.getParameter("remk")));

   	    String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData_1"));
   	    System.out.println("p_gubun=" + p_gubun);
   	    System.out.println(multiUpdateData);
   	    //String multiUpdateData2 = Util.checkString(req.getParameter("multiUpdateData_2"));
   	    //String multiUpdateData3 = Util.checkString(req.getParameter("multiUpdateData_3"));
   	    //System.out.println(multiUpdateData2);
   	    //System.out.println(multiUpdateData3);
   	    String[] converted = convertMultiUpdateData(multiUpdateData);
   	    //String[] converted2 = convertMultiUpdateData(multiUpdateData2);
   	    //String[] converted3 = convertMultiUpdateData(multiUpdateData3);
   	    int    gubun = 0 ;

   	    //Hashtable hash = getHashMultiUpdateData(multiUpdateData);

   	    //Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);
   	    //Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);


   	    for (int i=0; i<converted.length; i++){
   	    	System.out.println("converted[" + i + "]=" + converted[i] );
   	    }
   	    /*
   	    for (int i=0; i<converted2.length; i++){
	    	System.out.println("converted2[" + i + "]=" + converted2[i] );
	    }
   	    for (int i=0; i<converted3.length; i++){
   	    	System.out.println("converted3[" + i + "]=" + converted3[i] );
   	    }
   	    */

   	    //String m_gubun 	        = converted3[0];
   	    //String seq				= converted3[2];
   	    //String matr_cd          = converted3[3];
   	    //String medi_cd          = converted3[5];
   	    //String sect_cd          = converted3[6];
   	    //String owh_num_shet     = converted3[7];

   	    dm.gubun	  = converted[0].toUpperCase();
   	    dm.sub_seq     =    converted[2];
   	    dm.matr_cd     =    converted[3];
   	    dm.owh_unit	   =    converted[5];
   	    dm.yesday_cnt  =    converted[6];
	    dm.hjg_cnt	   =    converted[7];
	    dm.owh_qunt	   =    converted[8];
	    dm.owh_uprc    =    converted[9];
	    dm.owh_amt     =    converted[10];

	    dm.remk        =    converted[16];
	    dm.hjg_amt     =    converted[17];
	    dm.curdd_ewh_qunt  =    converted[18];
	    dm.plan_dt     =    converted[19];
	    dm.prv_cnt     =    converted[20];
	    //dm.owh_type    =    converted[21];
	    dm.ewh_budg_cd =    converted[22];
	    dm.owh_budg_cd =    converted[23];


	    //if (p_gubun.equals("1")){
    	//    dm.sub_seq_2 =    converted3[2];
    	//    dm.matr_cd_2 =    converted3[3];
    	//    dm.medi_cd_2 =    converted3[5];
    	//    dm.sect_cd_2 =    converted3[7];
    	//    dm.owh_num_shet_2 =    converted3[8];

    	//    dm.sub_seq_3 =    converted2[2];
    	//    dm.matr_cd_3 =    converted2[3];
    	//    dm.medi_cd_3 =    converted2[5];
    	//    dm.sect_cd_3 =    converted2[6];
    	//    dm.qunt_3    =    converted2[7];
	    //
	    //} else {
	    //	dm.sub_seq_2 =    converted3[2];
    	//    dm.matr_cd_2 =    converted3[3];
    	//    dm.medi_cd_2 =    converted3[4];
    	//    dm.sect_cd_2 =    converted3[5];
    	//    dm.owh_num_shet_2 =    converted3[6];

    	//    dm.sub_seq_3 =    converted2[6];
    	//    dm.matr_cd_3 =    converted2[2];
    	//    dm.medi_cd_3 =    converted2[3];
    	//    dm.sect_cd_3 =    converted2[4];
    	//    dm.qunt_3    =    converted2[5];
	    //}
    	dm.print();

    	ds = (MT_SUBMATROUT_1109_ADataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    /**
     * TAB 1 부재료출고 내역 등록
     */
    public void mt_submatrout_1111(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1111_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1111_ADM dm = new MT_SUBMATROUT_1111_ADM();
    	dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
   	    dm.setDelgubun(Util.checkString(req.getParameter("delGubun")));
   	    dm.setUser_id(Util.getSessionParameterValue(req, "emp_no", true));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));

   	    if( Util.checkString(req.getParameter("delGubun")).equals("ROW") )
   	    {
   	    	String multiUpdateData = Util.checkString(req.getParameter("multiUpdateData"));
   	    	Hashtable hash = getHashMultiUpdateData(multiUpdateData);
   	    	//System.out.println(multiUpdateData);

   	    	dm.matr_cd     =    (String)hash.get("matr_cd");
 		    dm.gubun       =    (String)hash.get("m");
 		    dm.sub_seq     =    (String)hash.get("sub_seq");
   	    }
    	dm.print();

    	ds = (MT_SUBMATROUT_1111_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }
    /**
     * TAB 1 부재료출고 내역 마감/마감취소
     */
    public void mt_submatrout_1112(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1112_UDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1112_UDM dm = new MT_SUBMATROUT_1112_UDM();
    	dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
   	    dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
   	    dm.setState(Util.checkString(req.getParameter("state")));
   	    dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
   	    dm.setPer_addr(req.getRemoteAddr());
    	dm.print();

    	ds = (MT_SUBMATROUT_1112_UDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1114(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1114_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1114_LDM dm = new MT_SUBMATROUT_1114_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setMedi_cd(Util.checkString(req.getParameter("medi_cd")));
    	dm.print();

    	ds = (MT_SUBMATROUT_1114_LDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    /**
     * TAB 1 부재료출고 PS판 조회
     */
    public void mt_submatrout_1115(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1115_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1115_LDM dm = new MT_SUBMATROUT_1115_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setEwh_dt(Util.checkString(req.getParameter("owh_dt")));
   	    dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
    	dm.print();

    	ds = (MT_SUBMATROUT_1115_LDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    /**
     * TAB 1 부재료출고 PS판 조회
     */
    public void mt_submatrout_1116(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1116_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1116_LDM dm = new MT_SUBMATROUT_1116_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
    	dm.print();

    	ds = (MT_SUBMATROUT_1116_LDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }
    
    /**
     * TAB 1 부재료출고 PS판 조회2
     */
    public void mt_submatrout_1118(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1118_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1118_LDM dm = new MT_SUBMATROUT_1118_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
    	dm.print();

    	ds = (MT_SUBMATROUT_1118_LDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    /**
     * TAB 1 부재료출고 마감취소
     */
    public void mt_submatrout_1117(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1117_UDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1117_UDM dm = new MT_SUBMATROUT_1117_UDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
   	    dm.setState(Util.checkString(req.getParameter("state")));
   	    dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
	    dm.setPer_addr(req.getRemoteAddr());
    	dm.print();

    	ds = (MT_SUBMATROUT_1117_UDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    /**
     * 가입고 현재고 조회
     */
    public void mt_submatrout_1150(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1150_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1150_LDM dm = new MT_SUBMATROUT_1150_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setEwh_dt(Util.checkString(req.getParameter("ewh_dt")));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();

    	ds = (MT_SUBMATROUT_1150_LDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }
    
    /**
     * 가입고 등록
     */
    public void mt_submatrout_1151(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1151_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1151_ADM dm = new MT_SUBMATROUT_1151_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    
   	    String multiUpData = Util.checkString(req.getParameter("multiUpData"));
   	    Hashtable hash = getHashMultiUpdateData(multiUpData);
   	    
   	    dm.gubun 			= (String)hash.get("m");
   	    dm.owh_dt  			= (String)hash.get("owh_dt");
		dm.matr_cd 			= (String)hash.get("matr_cd");
		dm.occr_dt  		= (String)hash.get("occr_dt");
		dm.seq   			= (String)hash.get("seq");
		dm.curdd_ewh_qunt   = (String)hash.get("curdd_ewh_qunt");
		dm.plan_dt   		= (String)hash.get("stmt_dt");
		
		dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
		dm.setPers_ipaddr(req.getRemoteAddr());
    	dm.print();

    	ds = (MT_SUBMATROUT_1151_ADataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }
    
    /**
     * 가입고 조회
     */
    public void mt_submatrout_1152(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1152_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1152_LDM dm = new MT_SUBMATROUT_1152_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOwh_dt_fr(Util.checkString(req.getParameter("owh_dt_fr")));
    	dm.setOwh_dt_to(Util.checkString(req.getParameter("owh_dt_to")));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
    	dm.print();

    	ds = (MT_SUBMATROUT_1152_LDataSet) manager.executeCall(dm);
        System.out.println(ds.errmsg);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }
    
    /**
     * TAB 2 건별 출고 조회
     */
    public void mt_submatrout_1200(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1200_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1200_LDM dm = new MT_SUBMATROUT_1200_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
   	    dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();

    	ds = (MT_SUBMATROUT_1200_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1201(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1201_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1201_LDM dm = new MT_SUBMATROUT_1201_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd_fr")));
    	dm.print();

    	ds = (MT_SUBMATROUT_1201_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1202(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1202_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1202_LDM dm = new MT_SUBMATROUT_1202_LDM();
    	String tempClsf = "";
    	String tempMatrFr = "";
    	String tempMatrTo = "";

    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setMatr_cd_clsf(Util.checkString(req.getParameter("matr_gubun")));
   	    //dm.setMatr_clas(Util.checkString(req.getParameter("matr_clas")));
   	    tempClsf = Util.checkString(req.getParameter("matr_gubun"));

   	    if(tempClsf.equals("1"))
   	    {
   	    	dm.setMatr_cd_fr(Util.checkString(req.getParameter("matr_cd_fr")));
   	    	dm.setMatr_cd_to(Util.checkString(req.getParameter("matr_cd_to")));
   	    }
   	    else if(tempClsf.equals("2"))
   	    {
   	    	System.out.println("11");
   	    	tempMatrFr = Util.checkString(req.getParameter("matr_cd_arr"));
   	    	tempMatrFr = tempMatrFr.replaceAll("#", "'");

   	    	dm.setMatr_cd_fr(tempMatrFr);
   	    	dm.setMatr_cd_to(Util.checkString(req.getParameter("matr_cd_to")));
   	    }
   	    else if(tempClsf.equals("3"))
	    {
   	    	dm.setMatr_cd_fr(Util.checkString(req.getParameter("matr_cd_fr")));
   	    	tempMatrTo = Util.checkString(req.getParameter("matr_cd_to"));
   	    	if( tempMatrTo.equals("") )
   	    	{
   	    		System.out.println(">>>>>>>>|" + tempMatrTo + "|@@");
   	    		dm.setMatr_cd_to("9999999");
   	    	}
   	    	else
   	    	{
   	    		dm.setMatr_cd_to(Util.checkString(req.getParameter("matr_cd_to")));
   	    	}
	    }

   	    dm.setOwh_dept(Util.checkString(req.getParameter("dept_cd")));
   	    dm.setOwh_budg_cd(Util.checkString(req.getParameter("owh_budg_cd")));
   	    dm.setMatr_clas(Util.checkString(req.getParameter("matr_clas")));
   	    dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
   	    dm.setOwh_dt_fr(Util.checkString(req.getParameter("occr_dt_fr")));
   	    dm.setOwh_dt_to(Util.checkString(req.getParameter("occr_dt_to")));
    	dm.print();

    	ds = (MT_SUBMATROUT_1202_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    /**
     * TAB 3 자재별 출고 조회
     */
    public void mt_submatrout_1300(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1300_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1300_LDM dm = new MT_SUBMATROUT_1300_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
   	    dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();

    	ds = (MT_SUBMATROUT_1300_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1301(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1301_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1301_LDM dm = new MT_SUBMATROUT_1301_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
        dm.setOccr_dt_fr(Util.checkString(req.getParameter("occr_dt_fr")));
        dm.setOccr_dt_to(Util.checkString(req.getParameter("occr_dt_to")));
        dm.setOwh_dept(Util.checkString(req.getParameter("dept_cd")));
    	dm.print();

    	ds = (MT_SUBMATROUT_1301_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    /**
     * TAB 4 안전재고 조회
     */
    public void mt_submatrout_1400(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1400_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1400_LDM dm = new MT_SUBMATROUT_1400_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
   	    dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.print();

    	ds = (MT_SUBMATROUT_1400_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1401(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1401_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1401_LDM dm = new MT_SUBMATROUT_1401_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.print();

    	ds = (MT_SUBMATROUT_1401_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1402(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1402_IDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1402_IDM dm = new MT_SUBMATROUT_1402_IDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPer_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPer_ip_addr(req.getRemoteAddr());

     	String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
     	System.out.println(multiUpdateData);
   	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

   	    dm.fac_clsf     = (String)hash.get("fac_clsf");
   	    dm.matr_cd      = (String)hash.get("matr_cd");
   	    dm.ordr_cnt     = (String)hash.get("ordr_cnt");
   	    dm.print();

    	ds = (MT_SUBMATROUT_1402_IDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1500(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1500_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1500_LDM dm = new MT_SUBMATROUT_1500_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setOwh_dt_fr(Util.checkString(req.getParameter("owh_dt_fr")));
   	    dm.setOwh_dt_to(Util.checkString(req.getParameter("owh_dt_to")));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setMatr_clas(Util.checkString(req.getParameter("matr_clas")));
   	    dm.print();

    	ds = (MT_SUBMATROUT_1500_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1501(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1501_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1501_LDM dm = new MT_SUBMATROUT_1501_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setOwh_dt(Util.checkString(req.getParameter("owh_dt")));
   	    dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
   	    dm.setSeq(Util.checkString(req.getParameter("seq")));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.setMatr_cd(Util.checkString(req.getParameter("matr_cd")));
   	    dm.print();

    	ds = (MT_SUBMATROUT_1501_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1502(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1502_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1502_LDM dm = new MT_SUBMATROUT_1502_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setOwh_dt(Util.checkString(req.getParameter("owh_dt")));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.print();

    	ds = (MT_SUBMATROUT_1502_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1503(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1503_LDataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1503_LDM dm = new MT_SUBMATROUT_1503_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
   	    dm.setOwh_dt(Util.checkString(req.getParameter("owh_dt")));
   	    dm.setFac_clsf(Util.checkString(req.getParameter("fac_clsf")));
   	    dm.print();

    	ds = (MT_SUBMATROUT_1503_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1510(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1510_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1510_ADM dm = new MT_SUBMATROUT_1510_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setPers_id(Util.getSessionParameterValue(req, "emp_no", true));
     	dm.setPers_ipaddr(req.getRemoteAddr());

     	String multiUpdateData1 = Util.checkString(req.getParameter("multiUpData1"));
     	System.out.println(multiUpdateData1);
   	    Hashtable hash1 = getHashMultiUpdateData(multiUpdateData1);

   	    String multiUpdateData2 = Util.checkString(req.getParameter("multiUpData2"));
   	    System.out.println(multiUpdateData2);
	    Hashtable hash2 = getHashMultiUpdateData(multiUpdateData2);

	    String multiUpdateData3 = Util.checkString(req.getParameter("multiUpData3"));
   	    System.out.println(multiUpdateData3);
	    Hashtable hash3 = getHashMultiUpdateData(multiUpdateData3);

   	    dm.occr_dt     = (String)hash1.get("occr_dt");
   	    dm.seq     = (String)hash1.get("seq");
   	    dm.sub_seq     = (String)hash1.get("sub_seq");
   	    dm.matr_cd      = (String)hash1.get("matr_cd");
   	    dm.medi_cd     = (String)hash1.get("medi_cd");
   	    dm.sect_cd     = (String)hash1.get("sect_cd");
   	    dm.qunt     = (String)hash1.get("qunt");

   	    dm.matr_cd2     = (String)hash2.get("matr_cd");
	    dm.medi_cd2     = (String)hash2.get("medi_cd");
	    dm.sect_cd2     = (String)hash2.get("sect_cd");
	    dm.qunt2        = (String)hash2.get("owh_num_shet");
	    dm.issu_dt2     = (String)hash2.get("issu_dt");
	    dm.fac_clsf2    = (String)hash2.get("fac_clsf");

	    dm.ink_clsf3    = (String)hash3.get("ink_clsf");
	    dm.medi_cd3     = (String)hash3.get("medi_cd");
	    dm.sect_cd3     = (String)hash3.get("sect_cd");
	    dm.bgn_gage3    = (String)hash3.get("bgn_gage");
	    dm.end_gage3    = (String)hash3.get("end_gage");
	    dm.qunt3        = (String)hash3.get("qunt");
	    dm.issu_dt3     = (String)hash3.get("issu_dt");
	    dm.fac_clsf3    = (String)hash3.get("fac_clsf");

   	    dm.print();

    	ds = (MT_SUBMATROUT_1510_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

    public void mt_submatrout_1520(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1520_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1520_ADM dm = new MT_SUBMATROUT_1520_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
    	dm.setSeq(Util.checkString(req.getParameter("seq")));
    	dm.setGubun(Util.checkString(req.getParameter("gubun")));
   	    dm.print();

    	ds = (MT_SUBMATROUT_1520_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }
    public void mt_submatrout_1521(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1521_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1521_ADM dm = new MT_SUBMATROUT_1521_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	String multiUpdateData  = Util.checkString(req.getParameter("multiUpData"));
   	    System.out.println(multiUpdateData );
	    Hashtable hash  = getHashMultiUpdateData(multiUpdateData );

	    dm.matr_cd2     = (String)hash.get("matr_cd");
	    dm.medi_cd2     = (String)hash.get("medi_cd");
	    dm.sect_cd2     = (String)hash.get("sect_cd");
	    dm.qunt2        = (String)hash.get("owh_num_shet");
	    dm.issu_dt2     = (String)hash.get("issu_dt");
	    dm.fac_clsf2    = (String)hash.get("fac_clsf");

   	    dm.print();

    	ds = (MT_SUBMATROUT_1521_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }
    public void mt_submatrout_1522(HttpServletRequest req, HttpServletResponse res) throws   AppException {
    	DBManager manager = new DBManager("MISMAT");
    	MT_SUBMATROUT_1522_ADataSet ds = null;

        // DM Setting
    	MT_SUBMATROUT_1522_ADM dm = new MT_SUBMATROUT_1522_ADM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	String multiUpdateData  = Util.checkString(req.getParameter("multiUpData"));
   	    System.out.println(multiUpdateData );
	    Hashtable hash  = getHashMultiUpdateData(multiUpdateData );

    	dm.ink_clsf3    = (String)hash.get("ink_clsf");
	    dm.medi_cd3     = (String)hash.get("medi_cd");
	    dm.sect_cd3     = (String)hash.get("sect_cd");
	    dm.bgn_gage3    = (String)hash.get("bgn_gage");
	    dm.end_gage3    = (String)hash.get("end_gage");
	    dm.qunt3        = (String)hash.get("qunt");
	    dm.issu_dt3     = (String)hash.get("issu_dt");
	    dm.fac_clsf3    = (String)hash.get("fac_clsf");
   	    dm.print();

    	ds = (MT_SUBMATROUT_1522_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
    }

	public void mt_submatrout_1600_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");

    	MT_SUBMATROUT_1600_LDataSet ds = null;
		MT_SUBMATROUT_1600_LDM dm = new MT_SUBMATROUT_1600_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.owh_dt = Util.checkString(req.getParameter("owh_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));

		dm.print();

    	ds = (MT_SUBMATROUT_1600_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
	}

	public void mt_submatrout_1601_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");

    	MT_SUBMATROUT_1601_LDataSet ds = null;
		MT_SUBMATROUT_1601_LDM dm = new MT_SUBMATROUT_1601_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);

		dm.print();

    	ds = (MT_SUBMATROUT_1601_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
	}

	public void mt_submatrout_1602_l(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");

    	MT_SUBMATROUT_1602_LDataSet ds = null;
		MT_SUBMATROUT_1602_LDM dm = new MT_SUBMATROUT_1602_LDM();

		dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.occr_dt = Util.checkString(req.getParameter("occr_dt"));
		dm.seq = Util.checkString(req.getParameter("seq"));
		dm.owh_dt = Util.checkString(req.getParameter("owh_dt"));
		dm.fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
		dm.matr_cd = Util.checkString(req.getParameter("matr_cd"));

		dm.print();

    	ds = (MT_SUBMATROUT_1602_LDataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
	}

	public void mt_submatrout_1603_a(HttpServletRequest req, HttpServletResponse res) throws AppException {
    	DBManager manager = new DBManager("MISMAT");

    	MT_SUBMATROUT_1603_ADataSet ds = null;
		MT_SUBMATROUT_1603_ADM dm = new MT_SUBMATROUT_1603_ADM();

     	String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
     	System.out.println(multiUpdateData);
   	    Hashtable hash = getHashMultiUpdateData(multiUpdateData);

   	    dm.cmpy_cd = Util.getSessionParameterValue(req, "cmpycd", true);
		dm.incmg_pers_ip = req.getRemoteAddr();
		dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

   	    dm.mode = Util.checkString((String)hash.get("m")).toUpperCase();
		dm.occr_dt = Util.checkString((String)hash.get("occr_dt"));
   	    dm.seq = Util.checkString((String)hash.get("seq"));
   	    dm.sub_seq = Util.checkString((String)hash.get("sub_seq"));
   	    dm.matr_cd = Util.checkString((String)hash.get("matr_cd"));
   	    dm.medi_cd = Util.checkString((String)hash.get("medi_cd"));
   	    dm.sect_cd = Util.checkString((String)hash.get("sect_cd"));
   	    dm.qunt = Util.checkString((String)hash.get("qunt"));

		dm.print();

    	ds = (MT_SUBMATROUT_1603_ADataSet) manager.executeCall(dm);
        if (!"".equals(ds.errcode)) {
        	System.out.println("DAO..error.");
            throw new AppException(ds.errcode, ds.errmsg);
        }

    	req.setAttribute("ds", ds);
	}

}
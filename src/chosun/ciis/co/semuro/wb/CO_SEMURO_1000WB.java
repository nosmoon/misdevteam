package chosun.ciis.co.semuro.wb;

import java.rmi.RemoteException;
import java.sql.SQLException;

//import javax.ejb.CreateException;
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

import chosun.ciis.co.semuro.dm.*;
import chosun.ciis.co.semuro.ds.*;
import chosun.ciis.co.semuro.wb.SecurityBean;


public class CO_SEMURO_1000WB extends BaseWB {

    /**
     * ��Ƽ���ڵ�ó�� row ������
     */
    public final String ROW_SEPARATOR = "|";
    /**
     * ��Ƽ���ڵ�ó�� column ������
     */
    public final String COL_SEPARATOR = "#";

    /**
     * ���ڼ��ݰ�꼭����� ��ȸ
     */
      public void co_semuro_1000(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	 DBManager manager = new DBManager("MISCOM");
    	 CO_SEMURO_1000_LDataSet ds = null;

          // DM Setting
      	CO_SEMURO_1000_LDM dm = new CO_SEMURO_1000_LDM();

      	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
      	dm.setDept_cd(Util.checkString(req.getParameter("dept_cd")));
      	dm.setEmp_no(Util.checkString(req.getParameter("emp_no")));

        dm.print();

        ds = (CO_SEMURO_1000_LDataSet)manager.executeCall(dm);

  	    if(!ds.getErrcode().equals("")) {
  	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
  	    }

          req.setAttribute("ds", ds);
      }

      /**
       * ���ڼ��ݰ�꼭����� ���,����,����
       */

      public void co_semuro_1001(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

      	BaseDataSet ds = null;
      	DBManager manager = new DBManager("MISCOM");
          // DM Setting
      	CO_SEMURO_1001_ADM dm = new CO_SEMURO_1001_ADM();

      	 String mode					= "";
      	 String occr_dt				= "";
         String seq					= "";
         String emp_no				= "";
         String flnm					= "";
         String tel_no				= "";
         String email				= "";
         String dept_cd				= "";
         String semuro_id			= "";


      	 String multiUpdateData = Util.checkString(req.getParameter("multiUpData"));
  	 	 System.out.println("multiUpdateData=" + multiUpdateData );
  		 String[] converted = convertMultiUpdateData(multiUpdateData);


          for (int i=0; i<converted.length; i++){
  			System.out.println("converted[" + i + "]=" + converted[i] );
  	  	  }

  		int idx = 0;
        mode			= converted[0];
        emp_no			= converted[2];
        flnm			= converted[3];
        email			= converted[4];
        tel_no			= converted[5];
        semuro_id		= converted[7];
        occr_dt			= converted[9];
        seq				= converted[10];
        dept_cd			= converted[11];

        dm.setMode(mode.toUpperCase());
        dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
        dm.setOccr_dt(occr_dt);
        dm.setSeq(seq);
        dm.setEmp_no(emp_no);
        dm.setFlnm(flnm);
        dm.setTel_no(tel_no);
        dm.setEmail(email);
        dm.setDept_cd(dept_cd);
      	dm.setSemuro_id(semuro_id);
      	dm.incmg_pers_ipadd = req.getRemoteAddr();
        dm.incmg_pers = Util.getSessionParameterValue(req, "emp_no", true);

        dm.print();

        ds = (CO_SEMURO_1001_ADataSet)manager.executeCall(dm);

  	    if(!ds.getErrcode().equals("")) {
  	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
  	    }

         req.setAttribute("ds", ds);
      }

    /**
     * TAB 1 ������ ���� ����
     */
    public void co_semuro_1100(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	BaseDataSet ds = null;
    	DBManager manager = new DBManager("MISCOM");
    	SecurityBean scu = new SecurityBean();
        // DM Setting
    	CO_SEMURO_1100_ADM dm = new CO_SEMURO_1100_ADM();

    	String sub_seq              = "";
    	String item_nm				= "";
        String item_dt				= "";
        String std                  = "";
        String qunt                 = "";
        String uprc				    = "";
        String item_suply_amt		= "";
        String tax_amt              = "";
        String remk                 = "";

        String multiUpdateData =   Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("item_sam")))) ;

        if(multiUpdateData.length() > 0 ){
            String[] converted = convertMultiUpdateData(multiUpdateData);

            int idx = 0;

            System.out.println("length=" + converted.length);
            sub_seq                   = converted[0];
            item_dt				= converted[1];
            item_nm				= converted[2];
            std                   = converted[3];
            qunt                  = converted[4];
            uprc				    = converted[5];
            item_suply_amt		= converted[6];
            tax_amt               = converted[7];
            remk                  = converted[8];
        }
        dm.setCmpy_cd("100");

        	dm.setSemuro_no(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("semuro_no"))))) ;
        	dm.setTax_stmt_clsf(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("tax_stmt_clsf")))) );
        	dm.setRmsg_pers_semuro_id( scu.decodeString( Util.Uni2Ksc(Util.checkString(req.getParameter("rmsg_pers_semuro_id"))) ));
        	dm.setSend_pers_id(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("send_pers_id"))) ));
        	dm.setSend_pers_eps_no(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("send_pers_eps_no"))) ));
        	dm.setSend_pers_presi_flnm( Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("send_pers_presi_flnm"))) ));
        	dm.setSend_pers_firmnm( Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("send_pers_firmnm"))) ));
        	dm.setSend_pers_addr( Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("send_pers_addr")))) );
        	dm.setSend_pers_bizcond( Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("send_pers_bizcond")))) );
        	dm.setSend_pers_indt( Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("send_pers_indt")))) );
        	dm.setSend_pers_email( Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("send_pers_email")))) );
        	dm.setIssu_dt(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("issu_dt")))) );
        	dm.setTot_suply_amt(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("tot_suply_amt")))) );
        	dm.setTot_amt(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("tot_amt"))))) ;
        	dm.setTot_tax_amt(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("tot_tax_amt"))))) ;
        	dm.setCash(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("cash"))))) ;
        	dm.setNote(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("note")))) );
        	dm.setChqe(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("chqe"))))) ;
        	dm.setTrust_unrcp_amt(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("trust_unrcp_amt"))))) ;
        	dm.setRcpt_clam_yn(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("rcpt_clam_yn"))))) ;
        	dm.setStat_clsf(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("stat_clsf"))))) ;
        	dm.setStat_clsf_dt_tm(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("stat_clsf_dt_tm")))) );
        	dm.setRremk( Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("remk")))) );
        	dm.setStat_clsf_dt_tm(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("stat_clsf_dt_tm")))) );
        	dm.setIncmg_pers_ip(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("incmg_pers_ip")))) );
        	dm.setIncmg_pers(  Util.Uni2Ksc(scu.decodeString(Util.checkString(req.getParameter("incmg_pers")))) );

        	dm.setSub_seq(sub_seq);
        	dm.setItem_nm(item_nm);
        	dm.setItem_dt(item_dt);
        	dm.setStd(std);
        	dm.setQunt(qunt);
        	dm.setUprc(uprc);
        	dm.setItem_suply_amt(item_suply_amt);
        	dm.setTax_amt(tax_amt);
        	dm.setRemk(remk);

        	dm.print();

        	ds = (CO_SEMURO_1100_ADataSet)manager.executeCall(dm);

      	    if(!ds.getErrcode().equals("")) {
      	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
      	    }
      	    req.setAttribute("ds", ds);
    }


    public void co_semuro_1200(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	BaseDataSet ds = null;
    	DBManager manager = new DBManager("MISCOM");
        // DM Setting
    	CO_SEMURO_1200_IDM dm = new CO_SEMURO_1200_IDM();

    	String multiUpdateData = Util.checkString(req.getParameter("tax_item"));
        String[] converted = convertMultiUpdateData(multiUpdateData);

        int idx = 0;

        System.out.println("length=" + converted.length);
        String item_nm				= converted[0];
        String item_dt				= converted[1];
        String std                  = converted[3];
        String qunt                 = converted[4];
        String uprc				    = converted[5];
        String item_suply_amt		= converted[6];
        String tax_amt              = converted[7];
        String remk                 = converted[8];

		dm.setCmpy_cd("100");
    	dm.setSemuro_no(Util.checkString(req.getParameter("semuro_no")));
    	dm.setTmsg_type(Util.checkString(req.getParameter("tmsg_type")));
    	dm.setTax_stmt_clsf(Util.checkString(req.getParameter("tax_stmt_clsf")));
    	dm.setRmsg_pers_clsf(Util.checkString(req.getParameter("rmsg_pers_clsf")));
    	dm.setSend_pers_semuro_id(Util.checkString(req.getParameter("send_pers_semuro_id")));
    	dm.setRmsg_pers_eps_no(Util.checkString(req.getParameter("rmsg_pers_eps_no")));
    	dm.setRmsg_pers_semuro_id(Util.checkString(req.getParameter("rmsg_pers_semuro_id")));
    	dm.setRmsg_pers_presi_nm(Util.checkString(req.getParameter("rmsg_pers_presi_nm")));
    	dm.setRmsg_pers_nm(Util.checkString(req.getParameter("rmsg_pers_nm")));
    	dm.setRmsg_pers_tel_no(Util.checkString(req.getParameter("rmsg_pers_tel_no")));
    	dm.setRmsg_pers_email(Util.checkString(req.getParameter("rmsg_pers_email")));
    	dm.setIssu_dt(Util.checkString(req.getParameter("issu_dt")));
    	dm.setNul_cnt(Util.checkString(req.getParameter("nul_cnt")));
    	dm.setTot_suply_amt(Util.checkString(req.getParameter("tot_suply_amt")));
    	dm.setTot_tax_amt(Util.checkString(req.getParameter("tot_tax_amt")));
    	dm.setTot_amt(Util.checkString(req.getParameter("tot_amt")));
    	dm.setCash(Util.checkString(req.getParameter("cash")));
    	dm.setChqe(Util.checkString(req.getParameter("chqe")));
    	dm.setNote(Util.checkString(req.getParameter("note")));
    	dm.setTrust_unrcp_amt(Util.checkString(req.getParameter("trust_unrcp_amt")));
    	dm.setRcpt_clam_yn(Util.checkString(req.getParameter("rcpt_clam_yn")));
    	dm.setStat_clsf(Util.checkString(req.getParameter("stat_clsf")));
    	dm.setStat_clsf_dt_tm(Util.checkString(req.getParameter("stat_clsf_dt_tm")));
    	dm.setRemk_head(Util.checkString(req.getParameter("remk_head")));

        dm.setItem_nm(item_nm);
    	dm.setItem_dt(item_dt);
    	dm.setStd(std);
    	dm.setQunt(qunt);
    	dm.setUprc(uprc);
    	dm.setItem_suply_amt(item_suply_amt);
    	dm.setTax_amt(tax_amt);
    	dm.setRemk(remk);

        dm.print();

        ds = (CO_SEMURO_1200_IDataSet)manager.executeCall(dm);

  	    if(!ds.getErrcode().equals("")) {
  	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
  	    }

  	    req.setAttribute("ds", ds);
    }

    public void co_semuro_1300(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	BaseDataSet ds = null;
    	SecurityBean scu = new SecurityBean();
    	DBManager manager = new DBManager("MISCOM");
        // DM Setting
    	CO_SEMURO_1300_UDM dm = new CO_SEMURO_1300_UDM();

    	String strGubun = "";

        dm.setCmpy_cd("100");

    	strGubun = Util.checkString(req.getParameter("gubun"));
    	if ( "S".equals(strGubun) ){
    		dm.setGubun(strGubun);
    		dm.setSemuro_no(Util.checkString(req.getParameter("semuro_no")));
    		dm.setStat_clsf("1");
        	dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
        	dm.setSeq(Util.checkString(req.getParameter("seq")));
    	}
    	else {
	        dm.setGubun(scu.decodeString(Util.checkString(req.getParameter("gubun"))));
        	dm.setStat_clsf(scu.decodeString(Util.checkString(req.getParameter("stat_clsf"))));
        	dm.setSemuro_no(scu.decodeString(Util.checkString(req.getParameter("semuro_no"))));
        	dm.setRtn_issu_semuro_no(scu.decodeString(Util.checkString(req.getParameter("rtn_issu_semuro_no"))));
        	}

       	dm.print();

       	ds = (CO_SEMURO_1300_UDataSet)manager.executeCall(dm);

  	    if(!ds.getErrcode().equals("")) {
  	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
  	    }
  	    req.setAttribute("ds", ds);
    }

    public void co_semuro_1301(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	BaseDataSet ds = null;
    	SecurityBean scu = new SecurityBean();
    	DBManager manager = new DBManager("MISCOM");
        // DM Setting
    	CO_SEMURO_1301_UDM dm = new CO_SEMURO_1301_UDM();


    	String strGubun = "";

        dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));

        String multiUpdateData = Util.checkString(req.getParameter("multistr"));
        System.out.println(multiUpdateData);
        String[] converted = convertMultiUpdateData(multiUpdateData);

        int idx = 0;

        System.out.println("length=" + converted.length);
        String occr_dt				= converted[0];
        String seq			    	= converted[1];
        String semuro_no            = converted[2];

        System.out.println("occr_dt=" + occr_dt);
        System.out.println("seq=" + seq);
        System.out.println("semuro_no=" + semuro_no);

        dm.setOccr_dt(occr_dt);
        dm.setSeq(seq);
        dm.setSemuro_no(semuro_no);

        dm.print();

        ds = (CO_SEMURO_1301_UDataSet)manager.executeCall(dm);

  	    if(!ds.getErrcode().equals("")) {
  	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
  	    }
  	    req.setAttribute("ds", ds);
    }



    public void co_semuro_1400(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	CO_SEMURO_1400_LDataSet ds = null;

        // DM Setting
    	DBManager manager = new DBManager("MISCOM");
    	CO_SEMURO_1400_LDM dm = new CO_SEMURO_1400_LDM();

    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setDept_cd(Util.getSessionParameterValue(req, "deptcd", true));
    	dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));

    	dm.setOccr_dt_fr(Util.checkString(req.getParameter("occr_dt_fr")));
    	dm.setOccr_dt_to(Util.checkString(req.getParameter("occr_dt_to")));
    	dm.setStat_clsf(Util.checkString(req.getParameter("stat_clsf")));

        dm.print();

        ds = (CO_SEMURO_1400_LDataSet)manager.executeCall(dm);

  	    if(!ds.getErrcode().equals("")) {
  	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
  	    }
  	    req.setAttribute("ds", ds);
    }

    public void co_semuro_1500(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	CO_SEMURO_1500_LDataSet ds = null;
    	DBManager manager = new DBManager("MISCOM");
        // DM Setting
    	CO_SEMURO_1500_LDM dm = new CO_SEMURO_1500_LDM();
    	dm.setCmpy_cd(Util.checkString(req.getParameter("cmpy_cd")));
    	dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
    	dm.setSeq(Util.checkString(req.getParameter("seq")));
        dm.print();

        ds = (CO_SEMURO_1500_LDataSet)manager.executeCall(dm);

  	    if(!ds.getErrcode().equals("")) {
  	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
  	    }
  	    req.setAttribute("ds", ds);
    }

    public void co_semuro_1600(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {

    	BaseDataSet ds = null;
    	DBManager manager = new DBManager("MISCOM");
    	// DM Setting
    	CO_SEMURO_1600_ADM dm = new CO_SEMURO_1600_ADM();

    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setPer_ipaddr(req.getRemoteAddr());
    	dm.setSemuro_id(Util.checkString(req.getParameter("semuro_id")));
    	dm.setFrom_dt(Util.checkString(req.getParameter("tax_dt_fr")));
    	dm.setTo_dt(Util.checkString(req.getParameter("tax_dt_to")));
    	dm.setSlip_clsf_cd(Util.checkString(req.getParameter("slip_occr_cd")));

    	dm.setTmsg_type(Util.checkString(req.getParameter("send_type")));
    	dm.setStmt_clsf(Util.checkString(req.getParameter("doc_kind")));
    	dm.setPers_clsf(Util.checkString(req.getParameter("recv_type")));

    	dm.setRecv_id(Util.checkString(req.getParameter("recv_id")));

       	dm.print();

       	ds = (CO_SEMURO_1600_ADataSet)manager.executeCall(dm);

  	    if(!ds.getErrcode().equals("")) {
  	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
  	    }
  	    req.setAttribute("ds", ds);

    }



    public void co_semuro_1700(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	CO_SEMURO_1700_LDataSet ds = null;
    	DBManager manager = new DBManager("MISCOM");
        // DM Setting
    	CO_SEMURO_1700_LDM dm = new CO_SEMURO_1700_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setFile_path(Util.checkString(req.getParameter("file_path")));
    	dm.setOccr_dt(Util.checkString(req.getParameter("occr_dt")));
    	dm.setSeq(Util.checkString(req.getParameter("seq")));
    	dm.setSlip_clsf_cd(Util.checkString(req.getParameter("slip_clsf_cd")));
    	dm.setSlip_occr_dt(Util.checkString(req.getParameter("slip_occr_dt")));
    	dm.setSlip_seq(Util.checkString(req.getParameter("slip_seq")));

        dm.print();

        ds = (CO_SEMURO_1700_LDataSet)manager.executeCall(dm);

  	    if(!ds.getErrcode().equals("")) {
  	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
  	    }
  	    req.setAttribute("ds", ds);
    }
    public void co_semuro_1800(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	CO_SEMURO_1800_LDataSet ds = null;
    	DBManager manager = new DBManager("MISCOM");
        // DM Setting
    	CO_SEMURO_1800_LDM dm = new CO_SEMURO_1800_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
        dm.print();

        ds = (CO_SEMURO_1800_LDataSet)manager.executeCall(dm);

  	    if(!ds.getErrcode().equals("")) {
  	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
  	    }
  	    req.setAttribute("ds", ds);
    }

    public void co_semuro_1900(HttpServletRequest req, HttpServletResponse res) throws AppException, SQLException {
    	CO_SEMURO_1900_LDataSet ds = null;
    	DBManager manager = new DBManager("MISCOM");
        // DM Setting
    	CO_SEMURO_1900_LDM dm = new CO_SEMURO_1900_LDM();
    	dm.setCmpy_cd(Util.getSessionParameterValue(req, "cmpycd", true));
    	dm.setEmp_no(Util.getSessionParameterValue(req, "emp_no", true));
    	dm.setSlip_occr_fr(Util.checkString(req.getParameter("tax_dt_fr")));
    	dm.setSlip_occr_to(Util.checkString(req.getParameter("tax_dt_to")));
    	dm.setSlip_occr_cd(Util.checkString(req.getParameter("slip_occr_cd")));

        dm.print();

        ds = (CO_SEMURO_1900_LDataSet)manager.executeCall(dm);

  	    if(!ds.getErrcode().equals("")) {
  	  	   throw new AppException(ds.getErrcode(), ds.getErrmsg());
  	    }
  	    req.setAttribute("ds", ds);
    }
}
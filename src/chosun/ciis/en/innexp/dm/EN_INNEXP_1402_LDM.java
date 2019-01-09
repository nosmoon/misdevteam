/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.en.innexp.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.ds.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1402_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String evnt_yy;
	public String evnt_cd;
	public String evnt_seq;
	public String rcpm_unit_clsf;
	public String erp_transfer_yn;
	public String tran_date_fr;
	public String tran_date_to;

	public EN_INNEXP_1402_LDM(){}
	public EN_INNEXP_1402_LDM(String cmpy_cd, String evnt_yy, String evnt_cd, String evnt_seq, String rcpm_unit_clsf, String erp_transfer_yn, String tran_date_fr, String tran_date_to){
		this.cmpy_cd = cmpy_cd;
		this.evnt_yy = evnt_yy;
		this.evnt_cd = evnt_cd;
		this.evnt_seq = evnt_seq;
		this.rcpm_unit_clsf = rcpm_unit_clsf;
		this.erp_transfer_yn = erp_transfer_yn;
		this.tran_date_fr = tran_date_fr;
		this.tran_date_to = tran_date_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEvnt_yy(String evnt_yy){
		this.evnt_yy = evnt_yy;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setEvnt_seq(String evnt_seq){
		this.evnt_seq = evnt_seq;
	}

	public void setRcpm_unit_clsf(String rcpm_unit_clsf){
		this.rcpm_unit_clsf = rcpm_unit_clsf;
	}

	public void setErp_transfer_yn(String erp_transfer_yn){
		this.erp_transfer_yn = erp_transfer_yn;
	}

	public void setTran_date_fr(String tran_date_fr){
		this.tran_date_fr = tran_date_fr;
	}

	public void setTran_date_to(String tran_date_to){
		this.tran_date_to = tran_date_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEvnt_yy(){
		return this.evnt_yy;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getEvnt_seq(){
		return this.evnt_seq;
	}

	public String getRcpm_unit_clsf(){
		return this.rcpm_unit_clsf;
	}

	public String getErp_transfer_yn(){
		return this.erp_transfer_yn;
	}

	public String getTran_date_fr(){
		return this.tran_date_fr;
	}

	public String getTran_date_to(){
		return this.tran_date_to;
	}

	public String getSQL(){
		 return "{ call MISENP.SP_EN_INNEXP_1402_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		EN_INNEXP_1402_LDM dm = (EN_INNEXP_1402_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.evnt_yy);
		cstmt.setString(5, dm.evnt_cd);
		cstmt.setString(6, dm.evnt_seq);
		cstmt.setString(7, dm.rcpm_unit_clsf);
		cstmt.setString(8, dm.erp_transfer_yn);
		cstmt.setString(9, dm.tran_date_fr);
		cstmt.setString(10, dm.tran_date_to);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.en.innexp.ds.EN_INNEXP_1402_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("evnt_yy = " + getEvnt_yy());
        System.out.println("evnt_cd = " + getEvnt_cd());
        System.out.println("evnt_seq = " + getEvnt_seq());
        System.out.println("rcpm_unit_clsf = " + getRcpm_unit_clsf());
        System.out.println("erp_transfer_yn = " + getErp_transfer_yn());
        System.out.println("tran_date_fr = " + getTran_date_fr());
        System.out.println("tran_date_to = " + getTran_date_to());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String evnt_yy = req.getParameter("evnt_yy");
if( evnt_yy == null){
	System.out.println(this.toString+" : evnt_yy is null" );
}else{
	System.out.println(this.toString+" : evnt_yy is "+evnt_yy );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String evnt_seq = req.getParameter("evnt_seq");
if( evnt_seq == null){
	System.out.println(this.toString+" : evnt_seq is null" );
}else{
	System.out.println(this.toString+" : evnt_seq is "+evnt_seq );
}
String rcpm_unit_clsf = req.getParameter("rcpm_unit_clsf");
if( rcpm_unit_clsf == null){
	System.out.println(this.toString+" : rcpm_unit_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpm_unit_clsf is "+rcpm_unit_clsf );
}
String erp_transfer_yn = req.getParameter("erp_transfer_yn");
if( erp_transfer_yn == null){
	System.out.println(this.toString+" : erp_transfer_yn is null" );
}else{
	System.out.println(this.toString+" : erp_transfer_yn is "+erp_transfer_yn );
}
String tran_date_fr = req.getParameter("tran_date_fr");
if( tran_date_fr == null){
	System.out.println(this.toString+" : tran_date_fr is null" );
}else{
	System.out.println(this.toString+" : tran_date_fr is "+tran_date_fr );
}
String tran_date_to = req.getParameter("tran_date_to");
if( tran_date_to == null){
	System.out.println(this.toString+" : tran_date_to is null" );
}else{
	System.out.println(this.toString+" : tran_date_to is "+tran_date_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String evnt_yy = Util.checkString(req.getParameter("evnt_yy"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String evnt_seq = Util.checkString(req.getParameter("evnt_seq"));
String rcpm_unit_clsf = Util.checkString(req.getParameter("rcpm_unit_clsf"));
String erp_transfer_yn = Util.checkString(req.getParameter("erp_transfer_yn"));
String tran_date_fr = Util.checkString(req.getParameter("tran_date_fr"));
String tran_date_to = Util.checkString(req.getParameter("tran_date_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String evnt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_yy")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String evnt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_seq")));
String rcpm_unit_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_unit_clsf")));
String erp_transfer_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("erp_transfer_yn")));
String tran_date_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_fr")));
String tran_date_to = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEvnt_yy(evnt_yy);
dm.setEvnt_cd(evnt_cd);
dm.setEvnt_seq(evnt_seq);
dm.setRcpm_unit_clsf(rcpm_unit_clsf);
dm.setErp_transfer_yn(erp_transfer_yn);
dm.setTran_date_fr(tran_date_fr);
dm.setTran_date_to(tran_date_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 20 13:47:07 KST 2009 */
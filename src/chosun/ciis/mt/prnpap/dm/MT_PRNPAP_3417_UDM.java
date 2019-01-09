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


package chosun.ciis.mt.prnpap.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.prnpap.ds.*;
import chosun.ciis.mt.prnpap.rec.*;

/**
 * 
 */


public class MT_PRNPAP_3417_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd_ar;
	public String occr_dt_ar;
	public String seq_ar;
	public String bw_pj_wgt;
	public String pers_id;

	public MT_PRNPAP_3417_UDM(){}
	public MT_PRNPAP_3417_UDM(String cmpy_cd_ar, String occr_dt_ar, String seq_ar, String bw_pj_wgt, String pers_id){
		this.cmpy_cd_ar = cmpy_cd_ar;
		this.occr_dt_ar = occr_dt_ar;
		this.seq_ar = seq_ar;
		this.bw_pj_wgt = bw_pj_wgt;
		this.pers_id = pers_id;
	}

	public void setCmpy_cd_ar(String cmpy_cd_ar){
		this.cmpy_cd_ar = cmpy_cd_ar;
	}

	public void setOccr_dt_ar(String occr_dt_ar){
		this.occr_dt_ar = occr_dt_ar;
	}

	public void setSeq_ar(String seq_ar){
		this.seq_ar = seq_ar;
	}

	public void setBw_pj_wgt(String bw_pj_wgt){
		this.bw_pj_wgt = bw_pj_wgt;
	}

	public void setPers_id(String pers_id){
		this.pers_id = pers_id;
	}

	public String getCmpy_cd_ar(){
		return this.cmpy_cd_ar;
	}

	public String getOccr_dt_ar(){
		return this.occr_dt_ar;
	}

	public String getSeq_ar(){
		return this.seq_ar;
	}

	public String getBw_pj_wgt(){
		return this.bw_pj_wgt;
	}

	public String getPers_id(){
		return this.pers_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_3417_U(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_3417_UDM dm = (MT_PRNPAP_3417_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd_ar);
		cstmt.setString(4, dm.occr_dt_ar);
		cstmt.setString(5, dm.seq_ar);
		cstmt.setString(6, dm.bw_pj_wgt);
		cstmt.setString(7, dm.pers_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_3417_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd_ar = [" + getCmpy_cd_ar() + "]");
		System.out.println("occr_dt_ar = [" + getOccr_dt_ar() + "]");
		System.out.println("seq_ar = [" + getSeq_ar() + "]");
		System.out.println("bw_pj_wgt = [" + getBw_pj_wgt() + "]");
		System.out.println("pers_id = [" + getPers_id() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd_ar = req.getParameter("cmpy_cd_ar");
if( cmpy_cd_ar == null){
	System.out.println(this.toString+" : cmpy_cd_ar is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd_ar is "+cmpy_cd_ar );
}
String occr_dt_ar = req.getParameter("occr_dt_ar");
if( occr_dt_ar == null){
	System.out.println(this.toString+" : occr_dt_ar is null" );
}else{
	System.out.println(this.toString+" : occr_dt_ar is "+occr_dt_ar );
}
String seq_ar = req.getParameter("seq_ar");
if( seq_ar == null){
	System.out.println(this.toString+" : seq_ar is null" );
}else{
	System.out.println(this.toString+" : seq_ar is "+seq_ar );
}
String bw_pj_wgt = req.getParameter("bw_pj_wgt");
if( bw_pj_wgt == null){
	System.out.println(this.toString+" : bw_pj_wgt is null" );
}else{
	System.out.println(this.toString+" : bw_pj_wgt is "+bw_pj_wgt );
}
String pers_id = req.getParameter("pers_id");
if( pers_id == null){
	System.out.println(this.toString+" : pers_id is null" );
}else{
	System.out.println(this.toString+" : pers_id is "+pers_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd_ar = Util.checkString(req.getParameter("cmpy_cd_ar"));
String occr_dt_ar = Util.checkString(req.getParameter("occr_dt_ar"));
String seq_ar = Util.checkString(req.getParameter("seq_ar"));
String bw_pj_wgt = Util.checkString(req.getParameter("bw_pj_wgt"));
String pers_id = Util.checkString(req.getParameter("pers_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd_ar")));
String occr_dt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_ar")));
String seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_ar")));
String bw_pj_wgt = Util.Uni2Ksc(Util.checkString(req.getParameter("bw_pj_wgt")));
String pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd_ar(cmpy_cd_ar);
dm.setOccr_dt_ar(occr_dt_ar);
dm.setSeq_ar(seq_ar);
dm.setBw_pj_wgt(bw_pj_wgt);
dm.setPers_id(pers_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Aug 30 18:48:39 KST 2009 */
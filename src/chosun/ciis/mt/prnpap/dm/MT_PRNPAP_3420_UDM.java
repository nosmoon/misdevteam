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


public class MT_PRNPAP_3420_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt_ar;
	public String seq_ar;
	public String cnt_ar;
	public String wgt_ar;
	public String pers_id;

	public MT_PRNPAP_3420_UDM(){}
	public MT_PRNPAP_3420_UDM(String cmpy_cd, String occr_dt_ar, String seq_ar, String cnt_ar, String wgt_ar, String pers_id){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt_ar = occr_dt_ar;
		this.seq_ar = seq_ar;
		this.cnt_ar = cnt_ar;
		this.wgt_ar = wgt_ar;
		this.pers_id = pers_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt_ar(String occr_dt_ar){
		this.occr_dt_ar = occr_dt_ar;
	}

	public void setSeq_ar(String seq_ar){
		this.seq_ar = seq_ar;
	}

	public void setCnt_ar(String cnt_ar){
		this.cnt_ar = cnt_ar;
	}

	public void setWgt_ar(String wgt_ar){
		this.wgt_ar = wgt_ar;
	}

	public void setPers_id(String pers_id){
		this.pers_id = pers_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt_ar(){
		return this.occr_dt_ar;
	}

	public String getSeq_ar(){
		return this.seq_ar;
	}

	public String getCnt_ar(){
		return this.cnt_ar;
	}

	public String getWgt_ar(){
		return this.wgt_ar;
	}

	public String getPers_id(){
		return this.pers_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PRNPAP_3420_U(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PRNPAP_3420_UDM dm = (MT_PRNPAP_3420_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt_ar);
		cstmt.setString(5, dm.seq_ar);
		cstmt.setString(6, dm.cnt_ar);
		cstmt.setString(7, dm.wgt_ar);
		cstmt.setString(8, dm.pers_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.prnpap.ds.MT_PRNPAP_3420_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt_ar = [" + getOccr_dt_ar() + "]");
		System.out.println("seq_ar = [" + getSeq_ar() + "]");
		System.out.println("cnt_ar = [" + getCnt_ar() + "]");
		System.out.println("wgt_ar = [" + getWgt_ar() + "]");
		System.out.println("pers_id = [" + getPers_id() + "]");
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
String cnt_ar = req.getParameter("cnt_ar");
if( cnt_ar == null){
	System.out.println(this.toString+" : cnt_ar is null" );
}else{
	System.out.println(this.toString+" : cnt_ar is "+cnt_ar );
}
String wgt_ar = req.getParameter("wgt_ar");
if( wgt_ar == null){
	System.out.println(this.toString+" : wgt_ar is null" );
}else{
	System.out.println(this.toString+" : wgt_ar is "+wgt_ar );
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

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt_ar = Util.checkString(req.getParameter("occr_dt_ar"));
String seq_ar = Util.checkString(req.getParameter("seq_ar"));
String cnt_ar = Util.checkString(req.getParameter("cnt_ar"));
String wgt_ar = Util.checkString(req.getParameter("wgt_ar"));
String pers_id = Util.checkString(req.getParameter("pers_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt_ar")));
String seq_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_ar")));
String cnt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("cnt_ar")));
String wgt_ar = Util.Uni2Ksc(Util.checkString(req.getParameter("wgt_ar")));
String pers_id = Util.Uni2Ksc(Util.checkString(req.getParameter("pers_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt_ar(occr_dt_ar);
dm.setSeq_ar(seq_ar);
dm.setCnt_ar(cnt_ar);
dm.setWgt_ar(wgt_ar);
dm.setPers_id(pers_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 27 15:57:20 KST 2017 */
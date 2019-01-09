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


package chosun.ciis.mt.submatrout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.ds.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_1111_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String delgubun;
	public String sub_seq;
	public String matr_cd;
	public String gubun;
	public String user_id;

	public MT_SUBMATROUT_1111_ADM(){}
	public MT_SUBMATROUT_1111_ADM(String cmpy_cd, String occr_dt, String seq, String delgubun, String sub_seq, String matr_cd, String gubun, String user_id){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.delgubun = delgubun;
		this.sub_seq = sub_seq;
		this.matr_cd = matr_cd;
		this.gubun = gubun;
		this.user_id = user_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDelgubun(String delgubun){
		this.delgubun = delgubun;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setUser_id(String user_id){
		this.user_id = user_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDelgubun(){
		return this.delgubun;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getUser_id(){
		return this.user_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_1111_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_1111_ADM dm = (MT_SUBMATROUT_1111_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.occr_dt);
		cstmt.setString(5, dm.seq);
		cstmt.setString(6, dm.delgubun);
		cstmt.setString(7, dm.sub_seq);
		cstmt.setString(8, dm.matr_cd);
		cstmt.setString(9, dm.gubun);
		cstmt.setString(10, dm.user_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_1111_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("delgubun = [" + getDelgubun() + "]");
		System.out.println("sub_seq = [" + getSub_seq() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("user_id = [" + getUser_id() + "]");
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
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String delgubun = req.getParameter("delgubun");
if( delgubun == null){
	System.out.println(this.toString+" : delgubun is null" );
}else{
	System.out.println(this.toString+" : delgubun is "+delgubun );
}
String sub_seq = req.getParameter("sub_seq");
if( sub_seq == null){
	System.out.println(this.toString+" : sub_seq is null" );
}else{
	System.out.println(this.toString+" : sub_seq is "+sub_seq );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String user_id = req.getParameter("user_id");
if( user_id == null){
	System.out.println(this.toString+" : user_id is null" );
}else{
	System.out.println(this.toString+" : user_id is "+user_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String delgubun = Util.checkString(req.getParameter("delgubun"));
String sub_seq = Util.checkString(req.getParameter("sub_seq"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String gubun = Util.checkString(req.getParameter("gubun"));
String user_id = Util.checkString(req.getParameter("user_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String delgubun = Util.Uni2Ksc(Util.checkString(req.getParameter("delgubun")));
String sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_seq")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String user_id = Util.Uni2Ksc(Util.checkString(req.getParameter("user_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setDelgubun(delgubun);
dm.setSub_seq(sub_seq);
dm.setMatr_cd(matr_cd);
dm.setGubun(gubun);
dm.setUser_id(user_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 13:41:08 KST 2009 */
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


package chosun.ciis.mt.submatrin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.ds.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 * 
 */


public class MT_SUBMATRIN_1118_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yy;
	public String seq_fr;
	public String seq_to;

	public MT_SUBMATRIN_1118_LDM(){}
	public MT_SUBMATRIN_1118_LDM(String cmpy_cd, String yy, String seq_fr, String seq_to){
		this.cmpy_cd = cmpy_cd;
		this.yy = yy;
		this.seq_fr = seq_fr;
		this.seq_to = seq_to;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYy(String yy){
		this.yy = yy;
	}

	public void setSeq_fr(String seq_fr){
		this.seq_fr = seq_fr;
	}

	public void setSeq_to(String seq_to){
		this.seq_to = seq_to;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYy(){
		return this.yy;
	}

	public String getSeq_fr(){
		return this.seq_fr;
	}

	public String getSeq_to(){
		return this.seq_to;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRIN_1118_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRIN_1118_LDM dm = (MT_SUBMATRIN_1118_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yy);
		cstmt.setString(5, dm.seq_fr);
		cstmt.setString(6, dm.seq_to);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrin.ds.MT_SUBMATRIN_1118_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("yy = [" + getYy() + "]");
		System.out.println("seq_fr = [" + getSeq_fr() + "]");
		System.out.println("seq_to = [" + getSeq_to() + "]");
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
String yy = req.getParameter("yy");
if( yy == null){
	System.out.println(this.toString+" : yy is null" );
}else{
	System.out.println(this.toString+" : yy is "+yy );
}
String seq_fr = req.getParameter("seq_fr");
if( seq_fr == null){
	System.out.println(this.toString+" : seq_fr is null" );
}else{
	System.out.println(this.toString+" : seq_fr is "+seq_fr );
}
String seq_to = req.getParameter("seq_to");
if( seq_to == null){
	System.out.println(this.toString+" : seq_to is null" );
}else{
	System.out.println(this.toString+" : seq_to is "+seq_to );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yy = Util.checkString(req.getParameter("yy"));
String seq_fr = Util.checkString(req.getParameter("seq_fr"));
String seq_to = Util.checkString(req.getParameter("seq_to"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yy = Util.Uni2Ksc(Util.checkString(req.getParameter("yy")));
String seq_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_fr")));
String seq_to = Util.Uni2Ksc(Util.checkString(req.getParameter("seq_to")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYy(yy);
dm.setSeq_fr(seq_fr);
dm.setSeq_to(seq_to);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 01 13:51:15 KST 2009 */
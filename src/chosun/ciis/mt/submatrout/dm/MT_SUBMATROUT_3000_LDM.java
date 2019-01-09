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


public class MT_SUBMATROUT_3000_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ordr_req_dd;
	public String matr_cd;
	public String req_cnt;

	public MT_SUBMATROUT_3000_LDM(){}
	public MT_SUBMATROUT_3000_LDM(String cmpy_cd, String ordr_req_dd, String matr_cd, String req_cnt){
		this.cmpy_cd = cmpy_cd;
		this.ordr_req_dd = ordr_req_dd;
		this.matr_cd = matr_cd;
		this.req_cnt = req_cnt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOrdr_req_dd(String ordr_req_dd){
		this.ordr_req_dd = ordr_req_dd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setReq_cnt(String req_cnt){
		this.req_cnt = req_cnt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOrdr_req_dd(){
		return this.ordr_req_dd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getReq_cnt(){
		return this.req_cnt;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATROUT_3000_L(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATROUT_3000_LDM dm = (MT_SUBMATROUT_3000_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ordr_req_dd);
		cstmt.setString(5, dm.matr_cd);
		cstmt.setString(6, dm.req_cnt);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrout.ds.MT_SUBMATROUT_3000_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ordr_req_dd = [" + getOrdr_req_dd() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("req_cnt = [" + getReq_cnt() + "]");
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
String ordr_req_dd = req.getParameter("ordr_req_dd");
if( ordr_req_dd == null){
	System.out.println(this.toString+" : ordr_req_dd is null" );
}else{
	System.out.println(this.toString+" : ordr_req_dd is "+ordr_req_dd );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String req_cnt = req.getParameter("req_cnt");
if( req_cnt == null){
	System.out.println(this.toString+" : req_cnt is null" );
}else{
	System.out.println(this.toString+" : req_cnt is "+req_cnt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ordr_req_dd = Util.checkString(req.getParameter("ordr_req_dd"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String req_cnt = Util.checkString(req.getParameter("req_cnt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ordr_req_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("ordr_req_dd")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String req_cnt = Util.Uni2Ksc(Util.checkString(req.getParameter("req_cnt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOrdr_req_dd(ordr_req_dd);
dm.setMatr_cd(matr_cd);
dm.setReq_cnt(req_cnt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 08 11:43:23 KST 2009 */
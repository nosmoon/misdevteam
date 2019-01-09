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


package chosun.ciis.mt.etccar.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etccar.ds.*;
import chosun.ciis.mt.etccar.rec.*;

/**
 * 
 */


public class MT_ETCCAR_9201_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String search_dt_fr;
	public String search_dt_to;
	public String req_stat;
	public String search_gubun;
	public String car_no;

	public MT_ETCCAR_9201_LDM(){}
	public MT_ETCCAR_9201_LDM(String cmpy_cd, String search_dt_fr, String search_dt_to, String req_stat, String search_gubun, String car_no){
		this.cmpy_cd = cmpy_cd;
		this.search_dt_fr = search_dt_fr;
		this.search_dt_to = search_dt_to;
		this.req_stat = req_stat;
		this.search_gubun = search_gubun;
		this.car_no = car_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSearch_dt_fr(String search_dt_fr){
		this.search_dt_fr = search_dt_fr;
	}

	public void setSearch_dt_to(String search_dt_to){
		this.search_dt_to = search_dt_to;
	}

	public void setReq_stat(String req_stat){
		this.req_stat = req_stat;
	}

	public void setSearch_gubun(String search_gubun){
		this.search_gubun = search_gubun;
	}
	
	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSearch_dt_fr(){
		return this.search_dt_fr;
	}

	public String getSearch_dt_to(){
		return this.search_dt_to;
	}

	public String getReq_stat(){
		return this.req_stat;
	}

	public String getSearch_gubun(){
		return this.search_gubun;
	}

	public String getCar_no(){
		return this.car_no;
	}
	
	public String getSQL(){
		 return "{ call MISMAT.SP_MT_ETCCAR_9201_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_ETCCAR_9201_LDM dm = (MT_ETCCAR_9201_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.search_dt_fr);
		cstmt.setString(5, dm.search_dt_to);
		cstmt.setString(6, dm.req_stat);
		cstmt.setString(7, dm.search_gubun);
		cstmt.setString(8, dm.car_no);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.etccar.ds.MT_ETCCAR_9201_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("search_dt_fr = [" + getSearch_dt_fr() + "]");
		System.out.println("search_dt_to = [" + getSearch_dt_to() + "]");
		System.out.println("req_stat = [" + getReq_stat() + "]");
		System.out.println("search_gubun = [" + getSearch_gubun() + "]");
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
String search_dt_fr = req.getParameter("search_dt_fr");
if( search_dt_fr == null){
	System.out.println(this.toString+" : search_dt_fr is null" );
}else{
	System.out.println(this.toString+" : search_dt_fr is "+search_dt_fr );
}
String search_dt_to = req.getParameter("search_dt_to");
if( search_dt_to == null){
	System.out.println(this.toString+" : search_dt_to is null" );
}else{
	System.out.println(this.toString+" : search_dt_to is "+search_dt_to );
}
String req_stat = req.getParameter("req_stat");
if( req_stat == null){
	System.out.println(this.toString+" : req_stat is null" );
}else{
	System.out.println(this.toString+" : req_stat is "+req_stat );
}
String search_gubun = req.getParameter("search_gubun");
if( search_gubun == null){
	System.out.println(this.toString+" : search_gubun is null" );
}else{
	System.out.println(this.toString+" : search_gubun is "+search_gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String search_dt_fr = Util.checkString(req.getParameter("search_dt_fr"));
String search_dt_to = Util.checkString(req.getParameter("search_dt_to"));
String req_stat = Util.checkString(req.getParameter("req_stat"));
String search_gubun = Util.checkString(req.getParameter("search_gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String search_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_fr")));
String search_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("search_dt_to")));
String req_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("req_stat")));
String search_gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("search_gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSearch_dt_fr(search_dt_fr);
dm.setSearch_dt_to(search_dt_to);
dm.setReq_stat(req_stat);
dm.setSearch_gubun(search_gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 04 10:24:11 KST 2012 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 
 */


public class SS_L_NEWJUSO_BOCHGDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String sido;
	public String gugun;
	public String rdnm;
	public String b_bldgnn;
	public String e_bldgnn;
	public String bldgnm;
	public String dong;
	public String b_localnn;
	public String e_localnn;
	public String bocd;
	public String empty_bocd;
	public String orderby;

	public SS_L_NEWJUSO_BOCHGDM(){}
	public SS_L_NEWJUSO_BOCHGDM(String sido, String gugun, String rdnm, String b_bldgnn, String e_bldgnn, String bldgnm, String dong, String b_localnn, String e_localnn, String bocd, String empty_bocd, String orderby){
		this.sido = sido;
		this.gugun = gugun;
		this.rdnm = rdnm;
		this.b_bldgnn = b_bldgnn;
		this.e_bldgnn = e_bldgnn;
		this.bldgnm = bldgnm;
		this.dong = dong;
		this.b_localnn = b_localnn;
		this.e_localnn = e_localnn;
		this.bocd = bocd;
		this.empty_bocd = empty_bocd;
		this.orderby = orderby;
	}

	public void setSido(String sido){
		this.sido = sido;
	}

	public void setGugun(String gugun){
		this.gugun = gugun;
	}

	public void setRdnm(String rdnm){
		this.rdnm = rdnm;
	}

	public void setB_bldgnn(String b_bldgnn){
		this.b_bldgnn = b_bldgnn;
	}

	public void setE_bldgnn(String e_bldgnn){
		this.e_bldgnn = e_bldgnn;
	}

	public void setBldgnm(String bldgnm){
		this.bldgnm = bldgnm;
	}

	public void setDong(String dong){
		this.dong = dong;
	}

	public void setB_localnn(String b_localnn){
		this.b_localnn = b_localnn;
	}

	public void setE_localnn(String e_localnn){
		this.e_localnn = e_localnn;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setEmpty_bocd(String empty_bocd){
		this.empty_bocd = empty_bocd;
	}

	public void setOrderby(String orderby){
		this.orderby = orderby;
	}

	public String getSido(){
		return this.sido;
	}

	public String getGugun(){
		return this.gugun;
	}

	public String getRdnm(){
		return this.rdnm;
	}

	public String getB_bldgnn(){
		return this.b_bldgnn;
	}

	public String getE_bldgnn(){
		return this.e_bldgnn;
	}

	public String getBldgnm(){
		return this.bldgnm;
	}

	public String getDong(){
		return this.dong;
	}

	public String getB_localnn(){
		return this.b_localnn;
	}

	public String getE_localnn(){
		return this.e_localnn;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getEmpty_bocd(){
		return this.empty_bocd;
	}

	public String getOrderby(){
		return this.orderby;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_NEWJUSO_BOCHG(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_NEWJUSO_BOCHGDM dm = (SS_L_NEWJUSO_BOCHGDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.sido);
		cstmt.setString(4, dm.gugun);
		cstmt.setString(5, dm.rdnm);
		cstmt.setString(6, dm.b_bldgnn);
		cstmt.setString(7, dm.e_bldgnn);
		cstmt.setString(8, dm.bldgnm);
		cstmt.setString(9, dm.dong);
		cstmt.setString(10, dm.b_localnn);
		cstmt.setString(11, dm.e_localnn);
		cstmt.setString(12, dm.bocd);
		cstmt.setString(13, dm.empty_bocd);
		cstmt.setString(14, dm.orderby);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_L_NEWJUSO_BOCHGDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("sido = [" + getSido() + "]");
		System.out.println("gugun = [" + getGugun() + "]");
		System.out.println("rdnm = [" + getRdnm() + "]");
		System.out.println("b_bldgnn = [" + getB_bldgnn() + "]");
		System.out.println("e_bldgnn = [" + getE_bldgnn() + "]");
		System.out.println("bldgnm = [" + getBldgnm() + "]");
		System.out.println("dong = [" + getDong() + "]");
		System.out.println("b_localnn = [" + getB_localnn() + "]");
		System.out.println("e_localnn = [" + getE_localnn() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("empty_bocd = [" + getEmpty_bocd() + "]");
		System.out.println("orderby = [" + getOrderby() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String sido = req.getParameter("sido");
if( sido == null){
	System.out.println(this.toString+" : sido is null" );
}else{
	System.out.println(this.toString+" : sido is "+sido );
}
String gugun = req.getParameter("gugun");
if( gugun == null){
	System.out.println(this.toString+" : gugun is null" );
}else{
	System.out.println(this.toString+" : gugun is "+gugun );
}
String rdnm = req.getParameter("rdnm");
if( rdnm == null){
	System.out.println(this.toString+" : rdnm is null" );
}else{
	System.out.println(this.toString+" : rdnm is "+rdnm );
}
String b_bldgnn = req.getParameter("b_bldgnn");
if( b_bldgnn == null){
	System.out.println(this.toString+" : b_bldgnn is null" );
}else{
	System.out.println(this.toString+" : b_bldgnn is "+b_bldgnn );
}
String e_bldgnn = req.getParameter("e_bldgnn");
if( e_bldgnn == null){
	System.out.println(this.toString+" : e_bldgnn is null" );
}else{
	System.out.println(this.toString+" : e_bldgnn is "+e_bldgnn );
}
String bldgnm = req.getParameter("bldgnm");
if( bldgnm == null){
	System.out.println(this.toString+" : bldgnm is null" );
}else{
	System.out.println(this.toString+" : bldgnm is "+bldgnm );
}
String dong = req.getParameter("dong");
if( dong == null){
	System.out.println(this.toString+" : dong is null" );
}else{
	System.out.println(this.toString+" : dong is "+dong );
}
String b_localnn = req.getParameter("b_localnn");
if( b_localnn == null){
	System.out.println(this.toString+" : b_localnn is null" );
}else{
	System.out.println(this.toString+" : b_localnn is "+b_localnn );
}
String e_localnn = req.getParameter("e_localnn");
if( e_localnn == null){
	System.out.println(this.toString+" : e_localnn is null" );
}else{
	System.out.println(this.toString+" : e_localnn is "+e_localnn );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String empty_bocd = req.getParameter("empty_bocd");
if( empty_bocd == null){
	System.out.println(this.toString+" : empty_bocd is null" );
}else{
	System.out.println(this.toString+" : empty_bocd is "+empty_bocd );
}
String orderby = req.getParameter("orderby");
if( orderby == null){
	System.out.println(this.toString+" : orderby is null" );
}else{
	System.out.println(this.toString+" : orderby is "+orderby );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String sido = Util.checkString(req.getParameter("sido"));
String gugun = Util.checkString(req.getParameter("gugun"));
String rdnm = Util.checkString(req.getParameter("rdnm"));
String b_bldgnn = Util.checkString(req.getParameter("b_bldgnn"));
String e_bldgnn = Util.checkString(req.getParameter("e_bldgnn"));
String bldgnm = Util.checkString(req.getParameter("bldgnm"));
String dong = Util.checkString(req.getParameter("dong"));
String b_localnn = Util.checkString(req.getParameter("b_localnn"));
String e_localnn = Util.checkString(req.getParameter("e_localnn"));
String bocd = Util.checkString(req.getParameter("bocd"));
String empty_bocd = Util.checkString(req.getParameter("empty_bocd"));
String orderby = Util.checkString(req.getParameter("orderby"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String sido = Util.Uni2Ksc(Util.checkString(req.getParameter("sido")));
String gugun = Util.Uni2Ksc(Util.checkString(req.getParameter("gugun")));
String rdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdnm")));
String b_bldgnn = Util.Uni2Ksc(Util.checkString(req.getParameter("b_bldgnn")));
String e_bldgnn = Util.Uni2Ksc(Util.checkString(req.getParameter("e_bldgnn")));
String bldgnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bldgnm")));
String dong = Util.Uni2Ksc(Util.checkString(req.getParameter("dong")));
String b_localnn = Util.Uni2Ksc(Util.checkString(req.getParameter("b_localnn")));
String e_localnn = Util.Uni2Ksc(Util.checkString(req.getParameter("e_localnn")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String empty_bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("empty_bocd")));
String orderby = Util.Uni2Ksc(Util.checkString(req.getParameter("orderby")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSido(sido);
dm.setGugun(gugun);
dm.setRdnm(rdnm);
dm.setB_bldgnn(b_bldgnn);
dm.setE_bldgnn(e_bldgnn);
dm.setBldgnm(bldgnm);
dm.setDong(dong);
dm.setB_localnn(b_localnn);
dm.setE_localnn(e_localnn);
dm.setBocd(bocd);
dm.setEmpty_bocd(empty_bocd);
dm.setOrderby(orderby);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 13 10:31:24 KST 2015 */
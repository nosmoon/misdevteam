/***************************************************************************************************
* 파일명 : .java
* 기능 : 자재 - 원재료관리 - 원재료세금계산서등록
* 작성일자 : 2010-06-04
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.papinout.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.ds.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_6107_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String yyyymm;
	public String dd_fr;
	public String dd_to;
	public String eps_no;
	public String gubun;
	public String per_ip_addr;
	public String per_id;

	public MT_PAPINOUT_6107_ADM(){}
	public MT_PAPINOUT_6107_ADM(String cmpy_cd, String yyyymm, String dd_fr, String dd_to, String eps_no, String gubun, String per_ip_addr, String per_id){
		this.cmpy_cd = cmpy_cd;
		this.yyyymm = yyyymm;
		this.dd_fr = dd_fr;
		this.dd_to = dd_to;
		this.eps_no = eps_no;
		this.gubun = gubun;
		this.per_ip_addr = per_ip_addr;
		this.per_id = per_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYyyymm(String yyyymm){
		this.yyyymm = yyyymm;
	}

	public void setDd_fr(String dd_fr){
		this.dd_fr = dd_fr;
	}

	public void setDd_to(String dd_to){
		this.dd_to = dd_to;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setPer_ip_addr(String per_ip_addr){
		this.per_ip_addr = per_ip_addr;
	}

	public void setPer_id(String per_id){
		this.per_id = per_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYyyymm(){
		return this.yyyymm;
	}

	public String getDd_fr(){
		return this.dd_fr;
	}

	public String getDd_to(){
		return this.dd_to;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getPer_ip_addr(){
		return this.per_ip_addr;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getSQL(){
		 return "{ call SP_MT_PAPINOUT_6107_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_6107_ADM dm = (MT_PAPINOUT_6107_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.yyyymm);
		cstmt.setString(5, dm.dd_fr);
		cstmt.setString(6, dm.dd_to);
		cstmt.setString(7, dm.eps_no);
		cstmt.setString(8, dm.gubun);
		cstmt.setString(9, dm.per_ip_addr);
		cstmt.setString(10, dm.per_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_6107_ADataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("yyyymm = " + getYyyymm());
        System.out.println("dd_fr = " + getDd_fr());
        System.out.println("dd_to = " + getDd_to());
        System.out.println("eps_no = " + getEps_no());
        System.out.println("gubun = " + getGubun());
        System.out.println("per_ip_addr = " + getPer_ip_addr());
        System.out.println("per_id = " + getPer_id());
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
String yyyymm = req.getParameter("yyyymm");
if( yyyymm == null){
	System.out.println(this.toString+" : yyyymm is null" );
}else{
	System.out.println(this.toString+" : yyyymm is "+yyyymm );
}
String dd_fr = req.getParameter("dd_fr");
if( dd_fr == null){
	System.out.println(this.toString+" : dd_fr is null" );
}else{
	System.out.println(this.toString+" : dd_fr is "+dd_fr );
}
String dd_to = req.getParameter("dd_to");
if( dd_to == null){
	System.out.println(this.toString+" : dd_to is null" );
}else{
	System.out.println(this.toString+" : dd_to is "+dd_to );
}
String eps_no = req.getParameter("eps_no");
if( eps_no == null){
	System.out.println(this.toString+" : eps_no is null" );
}else{
	System.out.println(this.toString+" : eps_no is "+eps_no );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String per_ip_addr = req.getParameter("per_ip_addr");
if( per_ip_addr == null){
	System.out.println(this.toString+" : per_ip_addr is null" );
}else{
	System.out.println(this.toString+" : per_ip_addr is "+per_ip_addr );
}
String per_id = req.getParameter("per_id");
if( per_id == null){
	System.out.println(this.toString+" : per_id is null" );
}else{
	System.out.println(this.toString+" : per_id is "+per_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
String dd_fr = Util.checkString(req.getParameter("dd_fr"));
String dd_to = Util.checkString(req.getParameter("dd_to"));
String eps_no = Util.checkString(req.getParameter("eps_no"));
String gubun = Util.checkString(req.getParameter("gubun"));
String per_ip_addr = Util.checkString(req.getParameter("per_ip_addr"));
String per_id = Util.checkString(req.getParameter("per_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
String dd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_fr")));
String dd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_to")));
String eps_no = Util.Uni2Ksc(Util.checkString(req.getParameter("eps_no")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String per_ip_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("per_ip_addr")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setYyyymm(yyyymm);
dm.setDd_fr(dd_fr);
dm.setDd_to(dd_to);
dm.setEps_no(eps_no);
dm.setGubun(gubun);
dm.setPer_ip_addr(per_ip_addr);
dm.setPer_id(per_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 04 13:58:34 KST 2010 */
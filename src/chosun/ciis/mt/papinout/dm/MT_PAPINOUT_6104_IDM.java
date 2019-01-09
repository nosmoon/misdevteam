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


public class MT_PAPINOUT_6104_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String eps_no;
	public String per_ip_addr;
	public String yyyymm;
	public String dd_fr;
	public String dd_to;
	public String suply_amt;
	public String vat_amt;
	public String fac_clsf;
	public String matr_cd;
	public String per_id;

	public MT_PAPINOUT_6104_IDM(){}
	public MT_PAPINOUT_6104_IDM(String cmpy_cd, String eps_no, String per_ip_addr, String yyyymm, String dd_fr, String dd_to, String suply_amt, String vat_amt, String fac_clsf, String matr_cd, String per_id){
		this.cmpy_cd = cmpy_cd;
		this.eps_no = eps_no;
		this.per_ip_addr = per_ip_addr;
		this.yyyymm = yyyymm;
		this.dd_fr = dd_fr;
		this.dd_to = dd_to;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.fac_clsf = fac_clsf;
		this.matr_cd = matr_cd;
		this.per_id = per_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEps_no(String eps_no){
		this.eps_no = eps_no;
	}

	public void setPer_ip_addr(String per_ip_addr){
		this.per_ip_addr = per_ip_addr;
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

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setPer_id(String per_id){
		this.per_id = per_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEps_no(){
		return this.eps_no;
	}

	public String getPer_ip_addr(){
		return this.per_ip_addr;
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

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_6104_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_6104_IDM dm = (MT_PAPINOUT_6104_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.eps_no);
		cstmt.setString(5, dm.per_ip_addr);
		cstmt.setString(6, dm.yyyymm);
		cstmt.setString(7, dm.dd_fr);
		cstmt.setString(8, dm.dd_to);
		cstmt.setString(9, dm.suply_amt);
		cstmt.setString(10, dm.vat_amt);
		cstmt.setString(11, dm.fac_clsf);
		cstmt.setString(12, dm.matr_cd);
		cstmt.setString(13, dm.per_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_6104_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("eps_no = [" + getEps_no() + "]");
		System.out.println("per_ip_addr = [" + getPer_ip_addr() + "]");
		System.out.println("yyyymm = [" + getYyyymm() + "]");
		System.out.println("dd_fr = [" + getDd_fr() + "]");
		System.out.println("dd_to = [" + getDd_to() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("per_id = [" + getPer_id() + "]");
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
String eps_no = req.getParameter("eps_no");
if( eps_no == null){
	System.out.println(this.toString+" : eps_no is null" );
}else{
	System.out.println(this.toString+" : eps_no is "+eps_no );
}
String per_ip_addr = req.getParameter("per_ip_addr");
if( per_ip_addr == null){
	System.out.println(this.toString+" : per_ip_addr is null" );
}else{
	System.out.println(this.toString+" : per_ip_addr is "+per_ip_addr );
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
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
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
String eps_no = Util.checkString(req.getParameter("eps_no"));
String per_ip_addr = Util.checkString(req.getParameter("per_ip_addr"));
String yyyymm = Util.checkString(req.getParameter("yyyymm"));
String dd_fr = Util.checkString(req.getParameter("dd_fr"));
String dd_to = Util.checkString(req.getParameter("dd_to"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String per_id = Util.checkString(req.getParameter("per_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String eps_no = Util.Uni2Ksc(Util.checkString(req.getParameter("eps_no")));
String per_ip_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("per_ip_addr")));
String yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yyyymm")));
String dd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_fr")));
String dd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dd_to")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEps_no(eps_no);
dm.setPer_ip_addr(per_ip_addr);
dm.setYyyymm(yyyymm);
dm.setDd_fr(dd_fr);
dm.setDd_to(dd_to);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setFac_clsf(fac_clsf);
dm.setMatr_cd(matr_cd);
dm.setPer_id(per_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 21 16:58:55 KST 2009 */
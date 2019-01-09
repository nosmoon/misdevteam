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


public class MT_PAPINOUT_2201_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ewh_dt;
	public String ewh_clsf;
	public String fac_clsf;
	public String inout_fac_clsf;
	public String matr_cd;
	public String dan;
	public String roll;
	public String wt;
	public String ibgo_amt;
	public String ibgo_vat;
	public String per_ip_addr;
	public String per_id;

	public MT_PAPINOUT_2201_ADM(){}
	public MT_PAPINOUT_2201_ADM(String cmpy_cd, String ewh_dt, String ewh_clsf, String fac_clsf, String inout_fac_clsf, String matr_cd, String dan, String roll, String wt, String ibgo_amt, String ibgo_vat, String per_ip_addr, String per_id){
		this.cmpy_cd = cmpy_cd;
		this.ewh_dt = ewh_dt;
		this.ewh_clsf = ewh_clsf;
		this.fac_clsf = fac_clsf;
		this.inout_fac_clsf = inout_fac_clsf;
		this.matr_cd = matr_cd;
		this.dan = dan;
		this.roll = roll;
		this.wt = wt;
		this.ibgo_amt = ibgo_amt;
		this.ibgo_vat = ibgo_vat;
		this.per_ip_addr = per_ip_addr;
		this.per_id = per_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setEwh_clsf(String ewh_clsf){
		this.ewh_clsf = ewh_clsf;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setInout_fac_clsf(String inout_fac_clsf){
		this.inout_fac_clsf = inout_fac_clsf;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setDan(String dan){
		this.dan = dan;
	}

	public void setRoll(String roll){
		this.roll = roll;
	}

	public void setWt(String wt){
		this.wt = wt;
	}

	public void setIbgo_amt(String ibgo_amt){
		this.ibgo_amt = ibgo_amt;
	}

	public void setIbgo_vat(String ibgo_vat){
		this.ibgo_vat = ibgo_vat;
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

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getEwh_clsf(){
		return this.ewh_clsf;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getInout_fac_clsf(){
		return this.inout_fac_clsf;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getDan(){
		return this.dan;
	}

	public String getRoll(){
		return this.roll;
	}

	public String getWt(){
		return this.wt;
	}

	public String getIbgo_amt(){
		return this.ibgo_amt;
	}

	public String getIbgo_vat(){
		return this.ibgo_vat;
	}

	public String getPer_ip_addr(){
		return this.per_ip_addr;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPINOUT_2201_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPINOUT_2201_ADM dm = (MT_PAPINOUT_2201_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ewh_dt);
		cstmt.setString(5, dm.ewh_clsf);
		cstmt.setString(6, dm.fac_clsf);
		cstmt.setString(7, dm.inout_fac_clsf);
		cstmt.setString(8, dm.matr_cd);
		cstmt.setString(9, dm.dan);
		cstmt.setString(10, dm.roll);
		cstmt.setString(11, dm.wt);
		cstmt.setString(12, dm.ibgo_amt);
		cstmt.setString(13, dm.ibgo_vat);
		cstmt.setString(14, dm.per_ip_addr);
		cstmt.setString(15, dm.per_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papinout.ds.MT_PAPINOUT_2201_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ewh_dt = [" + getEwh_dt() + "]");
		System.out.println("ewh_clsf = [" + getEwh_clsf() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("inout_fac_clsf = [" + getInout_fac_clsf() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("dan = [" + getDan() + "]");
		System.out.println("roll = [" + getRoll() + "]");
		System.out.println("wt = [" + getWt() + "]");
		System.out.println("ibgo_amt = [" + getIbgo_amt() + "]");
		System.out.println("ibgo_vat = [" + getIbgo_vat() + "]");
		System.out.println("per_ip_addr = [" + getPer_ip_addr() + "]");
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
String ewh_dt = req.getParameter("ewh_dt");
if( ewh_dt == null){
	System.out.println(this.toString+" : ewh_dt is null" );
}else{
	System.out.println(this.toString+" : ewh_dt is "+ewh_dt );
}
String ewh_clsf = req.getParameter("ewh_clsf");
if( ewh_clsf == null){
	System.out.println(this.toString+" : ewh_clsf is null" );
}else{
	System.out.println(this.toString+" : ewh_clsf is "+ewh_clsf );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String inout_fac_clsf = req.getParameter("inout_fac_clsf");
if( inout_fac_clsf == null){
	System.out.println(this.toString+" : inout_fac_clsf is null" );
}else{
	System.out.println(this.toString+" : inout_fac_clsf is "+inout_fac_clsf );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String dan = req.getParameter("dan");
if( dan == null){
	System.out.println(this.toString+" : dan is null" );
}else{
	System.out.println(this.toString+" : dan is "+dan );
}
String roll = req.getParameter("roll");
if( roll == null){
	System.out.println(this.toString+" : roll is null" );
}else{
	System.out.println(this.toString+" : roll is "+roll );
}
String wt = req.getParameter("wt");
if( wt == null){
	System.out.println(this.toString+" : wt is null" );
}else{
	System.out.println(this.toString+" : wt is "+wt );
}
String ibgo_amt = req.getParameter("ibgo_amt");
if( ibgo_amt == null){
	System.out.println(this.toString+" : ibgo_amt is null" );
}else{
	System.out.println(this.toString+" : ibgo_amt is "+ibgo_amt );
}
String ibgo_vat = req.getParameter("ibgo_vat");
if( ibgo_vat == null){
	System.out.println(this.toString+" : ibgo_vat is null" );
}else{
	System.out.println(this.toString+" : ibgo_vat is "+ibgo_vat );
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
String ewh_dt = Util.checkString(req.getParameter("ewh_dt"));
String ewh_clsf = Util.checkString(req.getParameter("ewh_clsf"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String inout_fac_clsf = Util.checkString(req.getParameter("inout_fac_clsf"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String dan = Util.checkString(req.getParameter("dan"));
String roll = Util.checkString(req.getParameter("roll"));
String wt = Util.checkString(req.getParameter("wt"));
String ibgo_amt = Util.checkString(req.getParameter("ibgo_amt"));
String ibgo_vat = Util.checkString(req.getParameter("ibgo_vat"));
String per_ip_addr = Util.checkString(req.getParameter("per_ip_addr"));
String per_id = Util.checkString(req.getParameter("per_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ewh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt")));
String ewh_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_clsf")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String inout_fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("inout_fac_clsf")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String dan = Util.Uni2Ksc(Util.checkString(req.getParameter("dan")));
String roll = Util.Uni2Ksc(Util.checkString(req.getParameter("roll")));
String wt = Util.Uni2Ksc(Util.checkString(req.getParameter("wt")));
String ibgo_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ibgo_amt")));
String ibgo_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("ibgo_vat")));
String per_ip_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("per_ip_addr")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEwh_dt(ewh_dt);
dm.setEwh_clsf(ewh_clsf);
dm.setFac_clsf(fac_clsf);
dm.setInout_fac_clsf(inout_fac_clsf);
dm.setMatr_cd(matr_cd);
dm.setDan(dan);
dm.setRoll(roll);
dm.setWt(wt);
dm.setIbgo_amt(ibgo_amt);
dm.setIbgo_vat(ibgo_vat);
dm.setPer_ip_addr(per_ip_addr);
dm.setPer_id(per_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 23 09:56:57 KST 2009 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 2009-01-29
* 작성자 : 김태길
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_1310_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String hndl_clsf;
	public String dlco_no;
	public String pubc_frdt;
	public String pubc_todt;
	public String basi_dt;
	public String bddb_proc_clsf;

	public AD_DEP_1310_LDM(){}
	public AD_DEP_1310_LDM(String cmpy_cd, String medi_cd, String hndl_clsf, String dlco_no, String pubc_frdt, String pubc_todt, String basi_dt, String bddb_proc_clsf){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.hndl_clsf = hndl_clsf;
		this.dlco_no = dlco_no;
		this.pubc_frdt = pubc_frdt;
		this.pubc_todt = pubc_todt;
		this.basi_dt = basi_dt;
		this.bddb_proc_clsf = bddb_proc_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setHndl_clsf(String hndl_clsf){
		this.hndl_clsf = hndl_clsf;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setPubc_frdt(String pubc_frdt){
		this.pubc_frdt = pubc_frdt;
	}

	public void setPubc_todt(String pubc_todt){
		this.pubc_todt = pubc_todt;
	}

	public void setBasi_dt(String basi_dt){
		this.basi_dt = basi_dt;
	}

	public void setBddb_proc_clsf(String bddb_proc_clsf){
		this.bddb_proc_clsf = bddb_proc_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getHndl_clsf(){
		return this.hndl_clsf;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getPubc_frdt(){
		return this.pubc_frdt;
	}

	public String getPubc_todt(){
		return this.pubc_todt;
	}

	public String getBasi_dt(){
		return this.basi_dt;
	}

	public String getBddb_proc_clsf(){
		return this.bddb_proc_clsf;
	}

	public String getSQL(){
		 return "{ call SP_AD_DEP_1310_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_1310_LDM dm = (AD_DEP_1310_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.hndl_clsf);
		cstmt.setString(6, dm.dlco_no);
		cstmt.setString(7, dm.pubc_frdt);
		cstmt.setString(8, dm.pubc_todt);
		cstmt.setString(9, dm.basi_dt);
		cstmt.setString(10, dm.bddb_proc_clsf);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_1310_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("medi_cd = " + getMedi_cd());
        System.out.println("hndl_clsf = " + getHndl_clsf());
        System.out.println("dlco_no = " + getDlco_no());
        System.out.println("pubc_frdt = " + getPubc_frdt());
        System.out.println("pubc_todt = " + getPubc_todt());
        System.out.println("basi_dt = " + getBasi_dt());
        System.out.println("bddb_proc_clsf = " + getBddb_proc_clsf());
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
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String hndl_clsf = req.getParameter("hndl_clsf");
if( hndl_clsf == null){
	System.out.println(this.toString+" : hndl_clsf is null" );
}else{
	System.out.println(this.toString+" : hndl_clsf is "+hndl_clsf );
}
String dlco_no = req.getParameter("dlco_no");
if( dlco_no == null){
	System.out.println(this.toString+" : dlco_no is null" );
}else{
	System.out.println(this.toString+" : dlco_no is "+dlco_no );
}
String pubc_frdt = req.getParameter("pubc_frdt");
if( pubc_frdt == null){
	System.out.println(this.toString+" : pubc_frdt is null" );
}else{
	System.out.println(this.toString+" : pubc_frdt is "+pubc_frdt );
}
String pubc_todt = req.getParameter("pubc_todt");
if( pubc_todt == null){
	System.out.println(this.toString+" : pubc_todt is null" );
}else{
	System.out.println(this.toString+" : pubc_todt is "+pubc_todt );
}
String basi_dt = req.getParameter("basi_dt");
if( basi_dt == null){
	System.out.println(this.toString+" : basi_dt is null" );
}else{
	System.out.println(this.toString+" : basi_dt is "+basi_dt );
}
String bddb_proc_clsf = req.getParameter("bddb_proc_clsf");
if( bddb_proc_clsf == null){
	System.out.println(this.toString+" : bddb_proc_clsf is null" );
}else{
	System.out.println(this.toString+" : bddb_proc_clsf is "+bddb_proc_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String hndl_clsf = Util.checkString(req.getParameter("hndl_clsf"));
String dlco_no = Util.checkString(req.getParameter("dlco_no"));
String pubc_frdt = Util.checkString(req.getParameter("pubc_frdt"));
String pubc_todt = Util.checkString(req.getParameter("pubc_todt"));
String basi_dt = Util.checkString(req.getParameter("basi_dt"));
String bddb_proc_clsf = Util.checkString(req.getParameter("bddb_proc_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String hndl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hndl_clsf")));
String dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_no")));
String pubc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_frdt")));
String pubc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_todt")));
String basi_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_dt")));
String bddb_proc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("bddb_proc_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setHndl_clsf(hndl_clsf);
dm.setDlco_no(dlco_no);
dm.setPubc_frdt(pubc_frdt);
dm.setPubc_todt(pubc_todt);
dm.setBasi_dt(basi_dt);
dm.setBddb_proc_clsf(bddb_proc_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 24 19:23:04 KST 2009 */
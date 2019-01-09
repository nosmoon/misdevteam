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


package chosun.ciis.ad.pub.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_PUB_2710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String medi_cd;
	public String frdt;
	public String todt;
	public String today;
	public String sect_no;
	public String sect;
	public String frside;
	public String toside;
	public String sect_nm;
	public String chro_clsf;

	public AD_PUB_2710_LDM(){}
	public AD_PUB_2710_LDM(String cmpy_cd, String medi_cd, String frdt, String todt, String today, String sect_no, String sect, String frside, String toside, String sect_nm, String chro_clsf){
		this.cmpy_cd = cmpy_cd;
		this.medi_cd = medi_cd;
		this.frdt = frdt;
		this.todt = todt;
		this.today = today;
		this.sect_no = sect_no;
		this.sect = sect;
		this.frside = frside;
		this.toside = toside;
		this.sect_nm = sect_nm;
		this.chro_clsf = chro_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setToday(String today){
		this.today = today;
	}

	public void setSect_no(String sect_no){
		this.sect_no = sect_no;
	}

	public void setSect(String sect){
		this.sect = sect;
	}

	public void setFrside(String frside){
		this.frside = frside;
	}

	public void setToside(String toside){
		this.toside = toside;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getToday(){
		return this.today;
	}

	public String getSect_no(){
		return this.sect_no;
	}

	public String getSect(){
		return this.sect;
	}

	public String getFrside(){
		return this.frside;
	}

	public String getToside(){
		return this.toside;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_2710_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_2710_LDM dm = (AD_PUB_2710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_cd);
		cstmt.setString(5, dm.frdt);
		cstmt.setString(6, dm.todt);
		cstmt.setString(7, dm.today);
		cstmt.setString(8, dm.sect_no);
		cstmt.setString(9, dm.sect);
		cstmt.setString(10, dm.frside);
		cstmt.setString(11, dm.toside);
		cstmt.setString(12, dm.sect_nm);
		cstmt.setString(13, dm.chro_clsf);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, OracleTypes.CURSOR);
		cstmt.registerOutParameter(17, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_2710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("frdt = [" + getFrdt() + "]");
		System.out.println("todt = [" + getTodt() + "]");
		System.out.println("today = [" + getToday() + "]");
		System.out.println("sect_no = [" + getSect_no() + "]");
		System.out.println("sect = [" + getSect() + "]");
		System.out.println("frside = [" + getFrside() + "]");
		System.out.println("toside = [" + getToside() + "]");
		System.out.println("sect_nm = [" + getSect_nm() + "]");
		System.out.println("chro_clsf = [" + getChro_clsf() + "]");
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
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String today = req.getParameter("today");
if( today == null){
	System.out.println(this.toString+" : today is null" );
}else{
	System.out.println(this.toString+" : today is "+today );
}
String sect_no = req.getParameter("sect_no");
if( sect_no == null){
	System.out.println(this.toString+" : sect_no is null" );
}else{
	System.out.println(this.toString+" : sect_no is "+sect_no );
}
String sect = req.getParameter("sect");
if( sect == null){
	System.out.println(this.toString+" : sect is null" );
}else{
	System.out.println(this.toString+" : sect is "+sect );
}
String frside = req.getParameter("frside");
if( frside == null){
	System.out.println(this.toString+" : frside is null" );
}else{
	System.out.println(this.toString+" : frside is "+frside );
}
String toside = req.getParameter("toside");
if( toside == null){
	System.out.println(this.toString+" : toside is null" );
}else{
	System.out.println(this.toString+" : toside is "+toside );
}
String sect_nm = req.getParameter("sect_nm");
if( sect_nm == null){
	System.out.println(this.toString+" : sect_nm is null" );
}else{
	System.out.println(this.toString+" : sect_nm is "+sect_nm );
}
String chro_clsf = req.getParameter("chro_clsf");
if( chro_clsf == null){
	System.out.println(this.toString+" : chro_clsf is null" );
}else{
	System.out.println(this.toString+" : chro_clsf is "+chro_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String today = Util.checkString(req.getParameter("today"));
String sect_no = Util.checkString(req.getParameter("sect_no"));
String sect = Util.checkString(req.getParameter("sect"));
String frside = Util.checkString(req.getParameter("frside"));
String toside = Util.checkString(req.getParameter("toside"));
String sect_nm = Util.checkString(req.getParameter("sect_nm"));
String chro_clsf = Util.checkString(req.getParameter("chro_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String today = Util.Uni2Ksc(Util.checkString(req.getParameter("today")));
String sect_no = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_no")));
String sect = Util.Uni2Ksc(Util.checkString(req.getParameter("sect")));
String frside = Util.Uni2Ksc(Util.checkString(req.getParameter("frside")));
String toside = Util.Uni2Ksc(Util.checkString(req.getParameter("toside")));
String sect_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("sect_nm")));
String chro_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chro_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMedi_cd(medi_cd);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setToday(today);
dm.setSect_no(sect_no);
dm.setSect(sect);
dm.setFrside(frside);
dm.setToside(toside);
dm.setSect_nm(sect_nm);
dm.setChro_clsf(chro_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 13 15:48:23 KST 2009 */
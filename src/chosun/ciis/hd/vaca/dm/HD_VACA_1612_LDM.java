

package chosun.ciis.hd.vaca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.ds.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1612_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String vaca_clsf;
	public String vaca_dtls_clsf;
	public String mang_cd_4;
	public String vaca_frdt;
	public String vaca_todt;

	public HD_VACA_1612_LDM(){}
	public HD_VACA_1612_LDM(String cmpy_cd, String emp_no, String vaca_clsf, String vaca_dtls_clsf, String mang_cd_4, String vaca_frdt, String vaca_todt){
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.vaca_clsf = vaca_clsf;
		this.vaca_dtls_clsf = vaca_dtls_clsf;
		this.mang_cd_4 = mang_cd_4;
		this.vaca_frdt = vaca_frdt;
		this.vaca_todt = vaca_todt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setVaca_clsf(String vaca_clsf){
		this.vaca_clsf = vaca_clsf;
	}

	public void setVaca_dtls_clsf(String vaca_dtls_clsf){
		this.vaca_dtls_clsf = vaca_dtls_clsf;
	}

	public void setMang_cd_4(String mang_cd_4){
		this.mang_cd_4 = mang_cd_4;
	}

	public void setVaca_frdt(String vaca_frdt){
		this.vaca_frdt = vaca_frdt;
	}

	public void setVaca_todt(String vaca_todt){
		this.vaca_todt = vaca_todt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getVaca_clsf(){
		return this.vaca_clsf;
	}

	public String getVaca_dtls_clsf(){
		return this.vaca_dtls_clsf;
	}

	public String getMang_cd_4(){
		return this.mang_cd_4;
	}

	public String getVaca_frdt(){
		return this.vaca_frdt;
	}

	public String getVaca_todt(){
		return this.vaca_todt;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_VACA_1612_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_VACA_1612_LDM dm = (HD_VACA_1612_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.emp_no);
		cstmt.setString(5, dm.vaca_clsf);
		cstmt.setString(6, dm.vaca_dtls_clsf);
		cstmt.setString(7, dm.mang_cd_4);
		cstmt.setString(8, dm.vaca_frdt);
		cstmt.setString(9, dm.vaca_todt);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_VACA_1612_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("vaca_clsf = [" + getVaca_clsf() + "]");
		System.out.println("vaca_dtls_clsf = [" + getVaca_dtls_clsf() + "]");
		System.out.println("mang_cd_4 = [" + getMang_cd_4() + "]");
		System.out.println("vaca_frdt = [" + getVaca_frdt() + "]");
		System.out.println("vaca_todt = [" + getVaca_todt() + "]");
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
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String vaca_clsf = req.getParameter("vaca_clsf");
if( vaca_clsf == null){
	System.out.println(this.toString+" : vaca_clsf is null" );
}else{
	System.out.println(this.toString+" : vaca_clsf is "+vaca_clsf );
}
String vaca_dtls_clsf = req.getParameter("vaca_dtls_clsf");
if( vaca_dtls_clsf == null){
	System.out.println(this.toString+" : vaca_dtls_clsf is null" );
}else{
	System.out.println(this.toString+" : vaca_dtls_clsf is "+vaca_dtls_clsf );
}
String mang_cd_4 = req.getParameter("mang_cd_4");
if( mang_cd_4 == null){
	System.out.println(this.toString+" : mang_cd_4 is null" );
}else{
	System.out.println(this.toString+" : mang_cd_4 is "+mang_cd_4 );
}
String vaca_frdt = req.getParameter("vaca_frdt");
if( vaca_frdt == null){
	System.out.println(this.toString+" : vaca_frdt is null" );
}else{
	System.out.println(this.toString+" : vaca_frdt is "+vaca_frdt );
}
String vaca_todt = req.getParameter("vaca_todt");
if( vaca_todt == null){
	System.out.println(this.toString+" : vaca_todt is null" );
}else{
	System.out.println(this.toString+" : vaca_todt is "+vaca_todt );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String vaca_clsf = Util.checkString(req.getParameter("vaca_clsf"));
String vaca_dtls_clsf = Util.checkString(req.getParameter("vaca_dtls_clsf"));
String mang_cd_4 = Util.checkString(req.getParameter("mang_cd_4"));
String vaca_frdt = Util.checkString(req.getParameter("vaca_frdt"));
String vaca_todt = Util.checkString(req.getParameter("vaca_todt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String vaca_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_clsf")));
String vaca_dtls_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_dtls_clsf")));
String mang_cd_4 = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_cd_4")));
String vaca_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_frdt")));
String vaca_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("vaca_todt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setVaca_clsf(vaca_clsf);
dm.setVaca_dtls_clsf(vaca_dtls_clsf);
dm.setMang_cd_4(mang_cd_4);
dm.setVaca_frdt(vaca_frdt);
dm.setVaca_todt(vaca_todt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Oct 29 16:59:47 KST 2010 */
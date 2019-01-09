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


package chosun.ciis.is.dep.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.dep.ds.*;
import chosun.ciis.is.dep.rec.*;

/**
 * 
 */


public class IS_DEP_2710_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String clsf;
	public String sale_proc_frdt;
	public String sale_proc_todt;
	public String dept_cd;
	public String sub_dept_cd;
	public String chrg_pers;
	public String dlco_clsf_cd_seq;
	public String sale_clsf;
	public String spc_sale_clsf;
	public String rvord_type;

	public IS_DEP_2710_LDM(){}
	public IS_DEP_2710_LDM(String cmpy_cd, String clsf, String sale_proc_frdt, String sale_proc_todt, String dept_cd, String sub_dept_cd, String chrg_pers, String dlco_clsf_cd_seq, String sale_clsf, String spc_sale_clsf, String rvord_type){
		this.cmpy_cd = cmpy_cd;
		this.clsf = clsf;
		this.sale_proc_frdt = sale_proc_frdt;
		this.sale_proc_todt = sale_proc_todt;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.chrg_pers = chrg_pers;
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
		this.sale_clsf = sale_clsf;
		this.spc_sale_clsf = spc_sale_clsf;
		this.rvord_type = rvord_type;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setSale_proc_frdt(String sale_proc_frdt){
		this.sale_proc_frdt = sale_proc_frdt;
	}

	public void setSale_proc_todt(String sale_proc_todt){
		this.sale_proc_todt = sale_proc_todt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpc_sale_clsf(String spc_sale_clsf){
		this.spc_sale_clsf = spc_sale_clsf;
	}

	public void setRvord_type(String rvord_type){
		this.rvord_type = rvord_type;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getSale_proc_frdt(){
		return this.sale_proc_frdt;
	}

	public String getSale_proc_todt(){
		return this.sale_proc_todt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpc_sale_clsf(){
		return this.spc_sale_clsf;
	}

	public String getRvord_type(){
		return this.rvord_type;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_DEP_2710_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_DEP_2710_LDM dm = (IS_DEP_2710_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.clsf);
		cstmt.setString(5, dm.sale_proc_frdt);
		cstmt.setString(6, dm.sale_proc_todt);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.sub_dept_cd);
		cstmt.setString(9, dm.chrg_pers);
		cstmt.setString(10, dm.dlco_clsf_cd_seq);
		cstmt.setString(11, dm.sale_clsf);
		cstmt.setString(12, dm.spc_sale_clsf);
		cstmt.setString(13, dm.rvord_type);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.dep.ds.IS_DEP_2710_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
		System.out.println("sale_proc_frdt = [" + getSale_proc_frdt() + "]");
		System.out.println("sale_proc_todt = [" + getSale_proc_todt() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("dlco_clsf_cd_seq = [" + getDlco_clsf_cd_seq() + "]");
		System.out.println("sale_clsf = [" + getSale_clsf() + "]");
		System.out.println("spc_sale_clsf = [" + getSpc_sale_clsf() + "]");
		System.out.println("rvord_type = [" + getRvord_type() + "]");
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
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String sale_proc_frdt = req.getParameter("sale_proc_frdt");
if( sale_proc_frdt == null){
	System.out.println(this.toString+" : sale_proc_frdt is null" );
}else{
	System.out.println(this.toString+" : sale_proc_frdt is "+sale_proc_frdt );
}
String sale_proc_todt = req.getParameter("sale_proc_todt");
if( sale_proc_todt == null){
	System.out.println(this.toString+" : sale_proc_todt is null" );
}else{
	System.out.println(this.toString+" : sale_proc_todt is "+sale_proc_todt );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String dlco_clsf_cd_seq = req.getParameter("dlco_clsf_cd_seq");
if( dlco_clsf_cd_seq == null){
	System.out.println(this.toString+" : dlco_clsf_cd_seq is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd_seq is "+dlco_clsf_cd_seq );
}
String sale_clsf = req.getParameter("sale_clsf");
if( sale_clsf == null){
	System.out.println(this.toString+" : sale_clsf is null" );
}else{
	System.out.println(this.toString+" : sale_clsf is "+sale_clsf );
}
String spc_sale_clsf = req.getParameter("spc_sale_clsf");
if( spc_sale_clsf == null){
	System.out.println(this.toString+" : spc_sale_clsf is null" );
}else{
	System.out.println(this.toString+" : spc_sale_clsf is "+spc_sale_clsf );
}
String rvord_type = req.getParameter("rvord_type");
if( rvord_type == null){
	System.out.println(this.toString+" : rvord_type is null" );
}else{
	System.out.println(this.toString+" : rvord_type is "+rvord_type );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clsf = Util.checkString(req.getParameter("clsf"));
String sale_proc_frdt = Util.checkString(req.getParameter("sale_proc_frdt"));
String sale_proc_todt = Util.checkString(req.getParameter("sale_proc_todt"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String dlco_clsf_cd_seq = Util.checkString(req.getParameter("dlco_clsf_cd_seq"));
String sale_clsf = Util.checkString(req.getParameter("sale_clsf"));
String spc_sale_clsf = Util.checkString(req.getParameter("spc_sale_clsf"));
String rvord_type = Util.checkString(req.getParameter("rvord_type"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String sale_proc_frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_proc_frdt")));
String sale_proc_todt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_proc_todt")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String dlco_clsf_cd_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd_seq")));
String sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_clsf")));
String spc_sale_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("spc_sale_clsf")));
String rvord_type = Util.Uni2Ksc(Util.checkString(req.getParameter("rvord_type")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setClsf(clsf);
dm.setSale_proc_frdt(sale_proc_frdt);
dm.setSale_proc_todt(sale_proc_todt);
dm.setDept_cd(dept_cd);
dm.setSub_dept_cd(sub_dept_cd);
dm.setChrg_pers(chrg_pers);
dm.setDlco_clsf_cd_seq(dlco_clsf_cd_seq);
dm.setSale_clsf(sale_clsf);
dm.setSpc_sale_clsf(spc_sale_clsf);
dm.setRvord_type(rvord_type);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed May 23 16:17:47 KST 2012 */
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


package chosun.ciis.hd.prz.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prz.ds.*;
import chosun.ciis.hd.prz.rec.*;

/**
 * 
 */


public class HD_PRZ_1101_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String aplc_dt_fm;
	public String aplc_dt_to;
	public String aplc_clsf;
	public String judg_clsf;

	public HD_PRZ_1101_LDM(){}
	public HD_PRZ_1101_LDM(String cmpy_cd, String dept_cd, String aplc_dt_fm, String aplc_dt_to, String aplc_clsf, String judg_clsf){
		this.cmpy_cd = cmpy_cd;
		this.dept_cd = dept_cd;
		this.aplc_dt_fm = aplc_dt_fm;
		this.aplc_dt_to = aplc_dt_to;
		this.aplc_clsf = aplc_clsf;
		this.judg_clsf = judg_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAplc_dt_fm(String aplc_dt_fm){
		this.aplc_dt_fm = aplc_dt_fm;
	}

	public void setAplc_dt_to(String aplc_dt_to){
		this.aplc_dt_to = aplc_dt_to;
	}

	public void setAplc_clsf(String aplc_clsf){
		this.aplc_clsf = aplc_clsf;
	}

	public void setJudg_clsf(String judg_clsf){
		this.judg_clsf = judg_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAplc_dt_fm(){
		return this.aplc_dt_fm;
	}

	public String getAplc_dt_to(){
		return this.aplc_dt_to;
	}

	public String getAplc_clsf(){
		return this.aplc_clsf;
	}

	public String getJudg_clsf(){
		return this.judg_clsf;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_PRZ_1101_L(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_PRZ_1101_LDM dm = (HD_PRZ_1101_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_cd);
		cstmt.setString(5, dm.aplc_dt_fm);
		cstmt.setString(6, dm.aplc_dt_to);
		cstmt.setString(7, dm.aplc_clsf);
		cstmt.setString(8, dm.judg_clsf);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.prz.ds.HD_PRZ_1101_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("aplc_dt_fm = [" + getAplc_dt_fm() + "]");
		System.out.println("aplc_dt_to = [" + getAplc_dt_to() + "]");
		System.out.println("aplc_clsf = [" + getAplc_clsf() + "]");
		System.out.println("judg_clsf = [" + getJudg_clsf() + "]");
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
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String aplc_dt_fm = req.getParameter("aplc_dt_fm");
if( aplc_dt_fm == null){
	System.out.println(this.toString+" : aplc_dt_fm is null" );
}else{
	System.out.println(this.toString+" : aplc_dt_fm is "+aplc_dt_fm );
}
String aplc_dt_to = req.getParameter("aplc_dt_to");
if( aplc_dt_to == null){
	System.out.println(this.toString+" : aplc_dt_to is null" );
}else{
	System.out.println(this.toString+" : aplc_dt_to is "+aplc_dt_to );
}
String aplc_clsf = req.getParameter("aplc_clsf");
if( aplc_clsf == null){
	System.out.println(this.toString+" : aplc_clsf is null" );
}else{
	System.out.println(this.toString+" : aplc_clsf is "+aplc_clsf );
}
String judg_clsf = req.getParameter("judg_clsf");
if( judg_clsf == null){
	System.out.println(this.toString+" : judg_clsf is null" );
}else{
	System.out.println(this.toString+" : judg_clsf is "+judg_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String aplc_dt_fm = Util.checkString(req.getParameter("aplc_dt_fm"));
String aplc_dt_to = Util.checkString(req.getParameter("aplc_dt_to"));
String aplc_clsf = Util.checkString(req.getParameter("aplc_clsf"));
String judg_clsf = Util.checkString(req.getParameter("judg_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String aplc_dt_fm = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt_fm")));
String aplc_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt_to")));
String aplc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_clsf")));
String judg_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("judg_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_cd(dept_cd);
dm.setAplc_dt_fm(aplc_dt_fm);
dm.setAplc_dt_to(aplc_dt_to);
dm.setAplc_clsf(aplc_clsf);
dm.setJudg_clsf(judg_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Aug 20 15:52:42 KST 2009 */
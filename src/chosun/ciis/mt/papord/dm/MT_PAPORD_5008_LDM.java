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


package chosun.ciis.mt.papord.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papord.ds.*;
import chosun.ciis.mt.papord.rec.*;

/**
 * 
 */


public class MT_PAPORD_5008_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String roll_a;
	public String roll_b;
	public String roll_c;
	public String fac_clsf;

	public MT_PAPORD_5008_LDM(){}
	public MT_PAPORD_5008_LDM(String cmpy_cd, String roll_a, String roll_b, String roll_c, String fac_clsf){
		this.cmpy_cd = cmpy_cd;
		this.roll_a = roll_a;
		this.roll_b = roll_b;
		this.roll_c = roll_c;
		this.fac_clsf = fac_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoll_a(String roll_a){
		this.roll_a = roll_a;
	}

	public void setRoll_b(String roll_b){
		this.roll_b = roll_b;
	}

	public void setRoll_c(String roll_c){
		this.roll_c = roll_c;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRoll_a(){
		return this.roll_a;
	}

	public String getRoll_b(){
		return this.roll_b;
	}

	public String getRoll_c(){
		return this.roll_c;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSQL(){
		 return "{ call MISMAT.SP_MT_PAPORD_5008_L(? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_PAPORD_5008_LDM dm = (MT_PAPORD_5008_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.roll_a);
		cstmt.setString(5, dm.roll_b);
		cstmt.setString(6, dm.roll_c);
		cstmt.setString(7, dm.fac_clsf);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.papord.ds.MT_PAPORD_5008_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("roll_a = [" + getRoll_a() + "]");
		System.out.println("roll_b = [" + getRoll_b() + "]");
		System.out.println("roll_c = [" + getRoll_c() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
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
String roll_a = req.getParameter("roll_a");
if( roll_a == null){
	System.out.println(this.toString+" : roll_a is null" );
}else{
	System.out.println(this.toString+" : roll_a is "+roll_a );
}
String roll_b = req.getParameter("roll_b");
if( roll_b == null){
	System.out.println(this.toString+" : roll_b is null" );
}else{
	System.out.println(this.toString+" : roll_b is "+roll_b );
}
String roll_c = req.getParameter("roll_c");
if( roll_c == null){
	System.out.println(this.toString+" : roll_c is null" );
}else{
	System.out.println(this.toString+" : roll_c is "+roll_c );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String roll_a = Util.checkString(req.getParameter("roll_a"));
String roll_b = Util.checkString(req.getParameter("roll_b"));
String roll_c = Util.checkString(req.getParameter("roll_c"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String roll_a = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_a")));
String roll_b = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_b")));
String roll_c = Util.Uni2Ksc(Util.checkString(req.getParameter("roll_c")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRoll_a(roll_a);
dm.setRoll_b(roll_b);
dm.setRoll_c(roll_c);
dm.setFac_clsf(fac_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 10 22:52:07 KST 2009 */
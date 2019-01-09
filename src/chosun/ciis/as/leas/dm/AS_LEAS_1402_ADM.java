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


package chosun.ciis.as.leas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.leas.ds.*;
import chosun.ciis.as.leas.rec.*;

/**
 * 
 */


public class AS_LEAS_1402_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String basi_yy;
	public String basi_qq;
	public String basi_int_rate;

	public AS_LEAS_1402_ADM(){}
	public AS_LEAS_1402_ADM(String mode, String cmpy_cd, String basi_yy, String basi_qq, String basi_int_rate){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.basi_yy = basi_yy;
		this.basi_qq = basi_qq;
		this.basi_int_rate = basi_int_rate;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBasi_yy(String basi_yy){
		this.basi_yy = basi_yy;
	}

	public void setBasi_qq(String basi_qq){
		this.basi_qq = basi_qq;
	}

	public void setBasi_int_rate(String basi_int_rate){
		this.basi_int_rate = basi_int_rate;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBasi_yy(){
		return this.basi_yy;
	}

	public String getBasi_qq(){
		return this.basi_qq;
	}

	public String getBasi_int_rate(){
		return this.basi_int_rate;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_LEAS_1402_A(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_LEAS_1402_ADM dm = (AS_LEAS_1402_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.basi_yy);
		cstmt.setString(6, dm.basi_qq);
		cstmt.setString(7, dm.basi_int_rate);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.leas.ds.AS_LEAS_1402_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("basi_yy = [" + getBasi_yy() + "]");
		System.out.println("basi_qq = [" + getBasi_qq() + "]");
		System.out.println("basi_int_rate = [" + getBasi_int_rate() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String basi_yy = req.getParameter("basi_yy");
if( basi_yy == null){
	System.out.println(this.toString+" : basi_yy is null" );
}else{
	System.out.println(this.toString+" : basi_yy is "+basi_yy );
}
String basi_qq = req.getParameter("basi_qq");
if( basi_qq == null){
	System.out.println(this.toString+" : basi_qq is null" );
}else{
	System.out.println(this.toString+" : basi_qq is "+basi_qq );
}
String basi_int_rate = req.getParameter("basi_int_rate");
if( basi_int_rate == null){
	System.out.println(this.toString+" : basi_int_rate is null" );
}else{
	System.out.println(this.toString+" : basi_int_rate is "+basi_int_rate );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String basi_yy = Util.checkString(req.getParameter("basi_yy"));
String basi_qq = Util.checkString(req.getParameter("basi_qq"));
String basi_int_rate = Util.checkString(req.getParameter("basi_int_rate"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String basi_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_yy")));
String basi_qq = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_qq")));
String basi_int_rate = Util.Uni2Ksc(Util.checkString(req.getParameter("basi_int_rate")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setBasi_yy(basi_yy);
dm.setBasi_qq(basi_qq);
dm.setBasi_int_rate(basi_int_rate);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat May 09 12:26:46 KST 2009 */
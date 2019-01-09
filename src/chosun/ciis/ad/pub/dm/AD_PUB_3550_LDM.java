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

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.ds.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3550_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String fr_mon;
	public String to_mon;

	public AD_PUB_3550_LDM(){}
	public AD_PUB_3550_LDM(String cmpy_cd, String fr_mon, String to_mon){
		this.cmpy_cd = cmpy_cd;
		this.fr_mon = fr_mon;
		this.to_mon = to_mon;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFr_mon(String fr_mon){
		this.fr_mon = fr_mon;
	}

	public void setTo_mon(String to_mon){
		this.to_mon = to_mon;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFr_mon(){
		return this.fr_mon;
	}

	public String getTo_mon(){
		return this.to_mon;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_PUB_3550_L(? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_PUB_3550_LDM dm = (AD_PUB_3550_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.fr_mon);
		cstmt.setString(5, dm.to_mon);
		cstmt.registerOutParameter(6, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.pub.ds.AD_PUB_3550_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("fr_mon = [" + getFr_mon() + "]");
		System.out.println("to_mon = [" + getTo_mon() + "]");
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
String fr_mon = req.getParameter("fr_mon");
if( fr_mon == null){
	System.out.println(this.toString+" : fr_mon is null" );
}else{
	System.out.println(this.toString+" : fr_mon is "+fr_mon );
}
String to_mon = req.getParameter("to_mon");
if( to_mon == null){
	System.out.println(this.toString+" : to_mon is null" );
}else{
	System.out.println(this.toString+" : to_mon is "+to_mon );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String fr_mon = Util.checkString(req.getParameter("fr_mon"));
String to_mon = Util.checkString(req.getParameter("to_mon"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String fr_mon = Util.Uni2Ksc(Util.checkString(req.getParameter("fr_mon")));
String to_mon = Util.Uni2Ksc(Util.checkString(req.getParameter("to_mon")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setFr_mon(fr_mon);
dm.setTo_mon(to_mon);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jan 24 16:42:50 KST 2017 */
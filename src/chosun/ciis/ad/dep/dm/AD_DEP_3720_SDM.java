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


package chosun.ciis.ad.dep.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_DEP_3720_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String rept_no;
	public String chk_item;

	public AD_DEP_3720_SDM(){}
	public AD_DEP_3720_SDM(String cmpy_cd, String rept_no, String chk_item){
		this.cmpy_cd = cmpy_cd;
		this.rept_no = rept_no;
		this.chk_item = chk_item;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRept_no(String rept_no){
		this.rept_no = rept_no;
	}

	public void setChk_item(String chk_item){
		this.chk_item = chk_item;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRept_no(){
		return this.rept_no;
	}

	public String getChk_item(){
		return this.chk_item;
	}

	public String getSQL(){
		 return "{ call MISADV.SP_AD_DEP_3720_S(? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_DEP_3720_SDM dm = (AD_DEP_3720_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.rept_no);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.setString(5, dm.chk_item);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.dep.ds.AD_DEP_3720_SDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("rept_no = [" + getRept_no() + "]");
		System.out.println("chk_item = [" + getChk_item() + "]");
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
String rept_no = req.getParameter("rept_no");
if( rept_no == null){
	System.out.println(this.toString+" : rept_no is null" );
}else{
	System.out.println(this.toString+" : rept_no is "+rept_no );
}
String chk_item = req.getParameter("chk_item");
if( chk_item == null){
	System.out.println(this.toString+" : chk_item is null" );
}else{
	System.out.println(this.toString+" : chk_item is "+chk_item );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String rept_no = Util.checkString(req.getParameter("rept_no"));
String chk_item = Util.checkString(req.getParameter("chk_item"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String rept_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rept_no")));
String chk_item = Util.Uni2Ksc(Util.checkString(req.getParameter("chk_item")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setRept_no(rept_no);
dm.setChk_item(chk_item);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 08 20:49:28 KST 2009 */
/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.ds.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_4002_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String receiptcodeidx;
	public String category;
	public String receiptcode;
	public String receiptcodetype;
	public String description;
	public String useinsert;
	public String mode;
	public String receiptcodeidx_2;
	public String category_2;
	public String receiptcode_2;
	public String receiptcodetype_2;
	public String description_2;
	public String useinsert_2;
	public String mode_2;

	public TN_BAS_4002_ADM(){}
	public TN_BAS_4002_ADM(String cmpy_cd, String incmg_pers, String receiptcodeidx, String category, String receiptcode, String receiptcodetype, String description, String useinsert, String mode, String receiptcodeidx_2, String category_2, String receiptcode_2, String receiptcodetype_2, String description_2, String useinsert_2, String mode_2){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.receiptcodeidx = receiptcodeidx;
		this.category = category;
		this.receiptcode = receiptcode;
		this.receiptcodetype = receiptcodetype;
		this.description = description;
		this.useinsert = useinsert;
		this.mode = mode;
		this.receiptcodeidx_2 = receiptcodeidx_2;
		this.category_2 = category_2;
		this.receiptcode_2 = receiptcode_2;
		this.receiptcodetype_2 = receiptcodetype_2;
		this.description_2 = description_2;
		this.useinsert_2 = useinsert_2;
		this.mode_2 = mode_2;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setReceiptcodeidx(String receiptcodeidx){
		this.receiptcodeidx = receiptcodeidx;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public void setReceiptcode(String receiptcode){
		this.receiptcode = receiptcode;
	}

	public void setReceiptcodetype(String receiptcodetype){
		this.receiptcodetype = receiptcodetype;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public void setUseinsert(String useinsert){
		this.useinsert = useinsert;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setReceiptcodeidx_2(String receiptcodeidx_2){
		this.receiptcodeidx_2 = receiptcodeidx_2;
	}

	public void setCategory_2(String category_2){
		this.category_2 = category_2;
	}

	public void setReceiptcode_2(String receiptcode_2){
		this.receiptcode_2 = receiptcode_2;
	}

	public void setReceiptcodetype_2(String receiptcodetype_2){
		this.receiptcodetype_2 = receiptcodetype_2;
	}

	public void setDescription_2(String description_2){
		this.description_2 = description_2;
	}

	public void setUseinsert_2(String useinsert_2){
		this.useinsert_2 = useinsert_2;
	}

	public void setMode_2(String mode_2){
		this.mode_2 = mode_2;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getReceiptcodeidx(){
		return this.receiptcodeidx;
	}

	public String getCategory(){
		return this.category;
	}

	public String getReceiptcode(){
		return this.receiptcode;
	}

	public String getReceiptcodetype(){
		return this.receiptcodetype;
	}

	public String getDescription(){
		return this.description;
	}

	public String getUseinsert(){
		return this.useinsert;
	}

	public String getMode(){
		return this.mode;
	}

	public String getReceiptcodeidx_2(){
		return this.receiptcodeidx_2;
	}

	public String getCategory_2(){
		return this.category_2;
	}

	public String getReceiptcode_2(){
		return this.receiptcode_2;
	}

	public String getReceiptcodetype_2(){
		return this.receiptcodetype_2;
	}

	public String getDescription_2(){
		return this.description_2;
	}

	public String getUseinsert_2(){
		return this.useinsert_2;
	}

	public String getMode_2(){
		return this.mode_2;
	}

	public String getSQL(){
		 return "{ call MISTNN.SP_TN_BAS_4002_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		TN_BAS_4002_ADM dm = (TN_BAS_4002_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.receiptcodeidx);
		cstmt.setString(6, dm.category);
		cstmt.setString(7, dm.receiptcode);
		cstmt.setString(8, dm.receiptcodetype);
		cstmt.setString(9, dm.description);
		cstmt.setString(10, dm.useinsert);
		cstmt.setString(11, dm.mode);
		cstmt.setString(12, dm.receiptcodeidx_2);
		cstmt.setString(13, dm.category_2);
		cstmt.setString(14, dm.receiptcode_2);
		cstmt.setString(15, dm.receiptcodetype_2);
		cstmt.setString(16, dm.description_2);
		cstmt.setString(17, dm.useinsert_2);
		cstmt.setString(18, dm.mode_2);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.tn.bas.ds.TN_BAS_4002_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("receiptcodeidx = [" + getReceiptcodeidx() + "]");
		System.out.println("category = [" + getCategory() + "]");
		System.out.println("receiptcode = [" + getReceiptcode() + "]");
		System.out.println("receiptcodetype = [" + getReceiptcodetype() + "]");
		System.out.println("description = [" + getDescription() + "]");
		System.out.println("useinsert = [" + getUseinsert() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("receiptcodeidx_2 = [" + getReceiptcodeidx_2() + "]");
		System.out.println("category_2 = [" + getCategory_2() + "]");
		System.out.println("receiptcode_2 = [" + getReceiptcode_2() + "]");
		System.out.println("receiptcodetype_2 = [" + getReceiptcodetype_2() + "]");
		System.out.println("description_2 = [" + getDescription_2() + "]");
		System.out.println("useinsert_2 = [" + getUseinsert_2() + "]");
		System.out.println("mode_2 = [" + getMode_2() + "]");
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
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String receiptcodeidx = req.getParameter("receiptcodeidx");
if( receiptcodeidx == null){
	System.out.println(this.toString+" : receiptcodeidx is null" );
}else{
	System.out.println(this.toString+" : receiptcodeidx is "+receiptcodeidx );
}
String category = req.getParameter("category");
if( category == null){
	System.out.println(this.toString+" : category is null" );
}else{
	System.out.println(this.toString+" : category is "+category );
}
String receiptcode = req.getParameter("receiptcode");
if( receiptcode == null){
	System.out.println(this.toString+" : receiptcode is null" );
}else{
	System.out.println(this.toString+" : receiptcode is "+receiptcode );
}
String receiptcodetype = req.getParameter("receiptcodetype");
if( receiptcodetype == null){
	System.out.println(this.toString+" : receiptcodetype is null" );
}else{
	System.out.println(this.toString+" : receiptcodetype is "+receiptcodetype );
}
String description = req.getParameter("description");
if( description == null){
	System.out.println(this.toString+" : description is null" );
}else{
	System.out.println(this.toString+" : description is "+description );
}
String useinsert = req.getParameter("useinsert");
if( useinsert == null){
	System.out.println(this.toString+" : useinsert is null" );
}else{
	System.out.println(this.toString+" : useinsert is "+useinsert );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String receiptcodeidx_2 = req.getParameter("receiptcodeidx_2");
if( receiptcodeidx_2 == null){
	System.out.println(this.toString+" : receiptcodeidx_2 is null" );
}else{
	System.out.println(this.toString+" : receiptcodeidx_2 is "+receiptcodeidx_2 );
}
String category_2 = req.getParameter("category_2");
if( category_2 == null){
	System.out.println(this.toString+" : category_2 is null" );
}else{
	System.out.println(this.toString+" : category_2 is "+category_2 );
}
String receiptcode_2 = req.getParameter("receiptcode_2");
if( receiptcode_2 == null){
	System.out.println(this.toString+" : receiptcode_2 is null" );
}else{
	System.out.println(this.toString+" : receiptcode_2 is "+receiptcode_2 );
}
String receiptcodetype_2 = req.getParameter("receiptcodetype_2");
if( receiptcodetype_2 == null){
	System.out.println(this.toString+" : receiptcodetype_2 is null" );
}else{
	System.out.println(this.toString+" : receiptcodetype_2 is "+receiptcodetype_2 );
}
String description_2 = req.getParameter("description_2");
if( description_2 == null){
	System.out.println(this.toString+" : description_2 is null" );
}else{
	System.out.println(this.toString+" : description_2 is "+description_2 );
}
String useinsert_2 = req.getParameter("useinsert_2");
if( useinsert_2 == null){
	System.out.println(this.toString+" : useinsert_2 is null" );
}else{
	System.out.println(this.toString+" : useinsert_2 is "+useinsert_2 );
}
String mode_2 = req.getParameter("mode_2");
if( mode_2 == null){
	System.out.println(this.toString+" : mode_2 is null" );
}else{
	System.out.println(this.toString+" : mode_2 is "+mode_2 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String receiptcodeidx = Util.checkString(req.getParameter("receiptcodeidx"));
String category = Util.checkString(req.getParameter("category"));
String receiptcode = Util.checkString(req.getParameter("receiptcode"));
String receiptcodetype = Util.checkString(req.getParameter("receiptcodetype"));
String description = Util.checkString(req.getParameter("description"));
String useinsert = Util.checkString(req.getParameter("useinsert"));
String mode = Util.checkString(req.getParameter("mode"));
String receiptcodeidx_2 = Util.checkString(req.getParameter("receiptcodeidx_2"));
String category_2 = Util.checkString(req.getParameter("category_2"));
String receiptcode_2 = Util.checkString(req.getParameter("receiptcode_2"));
String receiptcodetype_2 = Util.checkString(req.getParameter("receiptcodetype_2"));
String description_2 = Util.checkString(req.getParameter("description_2"));
String useinsert_2 = Util.checkString(req.getParameter("useinsert_2"));
String mode_2 = Util.checkString(req.getParameter("mode_2"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String receiptcodeidx = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptcodeidx")));
String category = Util.Uni2Ksc(Util.checkString(req.getParameter("category")));
String receiptcode = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptcode")));
String receiptcodetype = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptcodetype")));
String description = Util.Uni2Ksc(Util.checkString(req.getParameter("description")));
String useinsert = Util.Uni2Ksc(Util.checkString(req.getParameter("useinsert")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String receiptcodeidx_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptcodeidx_2")));
String category_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("category_2")));
String receiptcode_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptcode_2")));
String receiptcodetype_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("receiptcodetype_2")));
String description_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("description_2")));
String useinsert_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("useinsert_2")));
String mode_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_2")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setReceiptcodeidx(receiptcodeidx);
dm.setCategory(category);
dm.setReceiptcode(receiptcode);
dm.setReceiptcodetype(receiptcodetype);
dm.setDescription(description);
dm.setUseinsert(useinsert);
dm.setMode(mode);
dm.setReceiptcodeidx_2(receiptcodeidx_2);
dm.setCategory_2(category_2);
dm.setReceiptcode_2(receiptcode_2);
dm.setReceiptcodetype_2(receiptcodetype_2);
dm.setDescription_2(description_2);
dm.setUseinsert_2(useinsert_2);
dm.setMode_2(mode_2);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 04 11:17:05 KST 2016 */
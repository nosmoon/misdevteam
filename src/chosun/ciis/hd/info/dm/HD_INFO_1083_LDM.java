/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_1083_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String frnc_word_cd;

	public HD_INFO_1083_LDM(){}
	public HD_INFO_1083_LDM(String cmpy_cd, String frnc_word_cd){
		this.cmpy_cd = cmpy_cd;
		this.frnc_word_cd = frnc_word_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setFrnc_word_cd(String frnc_word_cd){
		this.frnc_word_cd = frnc_word_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getFrnc_word_cd(){
		return this.frnc_word_cd;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_1083_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_1083_LDM dm = (HD_INFO_1083_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.frnc_word_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_1083_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("frnc_word_cd = [" + getFrnc_word_cd() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String frnc_word_cd = req.getParameter("frnc_word_cd");
if( frnc_word_cd == null){
	System.out.println(this.toString+" : frnc_word_cd is null" );
}else{
	System.out.println(this.toString+" : frnc_word_cd is "+frnc_word_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String frnc_word_cd = Util.checkString(req.getParameter("frnc_word_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String frnc_word_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frnc_word_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setFrnc_word_cd(frnc_word_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Aug 11 18:03:22 KST 2009 */
/***************************************************************************************************
* ���ϸ� : .java
* ��� : �Ǹ�-��������-�̻絶�ڼ�����Ȳ
* �ۼ����� : 2011-12-05
* �ۼ��� : �̱⿵
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_L_EMP_NWSPRDR_RDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String search_flag_rdr;
	public String search_word_rdr;

	public SS_L_EMP_NWSPRDR_RDRDM(){}
	public SS_L_EMP_NWSPRDR_RDRDM(String search_flag_rdr, String search_word_rdr){
		this.search_flag_rdr = search_flag_rdr;
		this.search_word_rdr = search_word_rdr;
	}

	public void setSearch_flag_rdr(String search_flag_rdr){
		this.search_flag_rdr = search_flag_rdr;
	}

	public void setSearch_word_rdr(String search_word_rdr){
		this.search_word_rdr = search_word_rdr;
	}

	public String getSearch_flag_rdr(){
		return this.search_flag_rdr;
	}

	public String getSearch_word_rdr(){
		return this.search_word_rdr;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_L_EMP_NWSPRDR_RDR(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EMP_NWSPRDR_RDRDM dm = (SS_L_EMP_NWSPRDR_RDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.search_flag_rdr);
		cstmt.setString(4, dm.search_word_rdr);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EMP_NWSPRDR_RDRDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("search_flag_rdr = [" + getSearch_flag_rdr() + "]");
		System.out.println("search_word_rdr = [" + getSearch_word_rdr() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó�� �� ���Ȯ�� �˻�� ����Ͻʽÿ�.

String search_flag_rdr = req.getParameter("search_flag_rdr");
if( search_flag_rdr == null){
	System.out.println(this.toString+" : search_flag_rdr is null" );
}else{
	System.out.println(this.toString+" : search_flag_rdr is "+search_flag_rdr );
}
String search_word_rdr = req.getParameter("search_word_rdr");
if( search_word_rdr == null){
	System.out.println(this.toString+" : search_word_rdr is null" );
}else{
	System.out.println(this.toString+" : search_word_rdr is "+search_word_rdr );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String search_flag_rdr = Util.checkString(req.getParameter("search_flag_rdr"));
String search_word_rdr = Util.checkString(req.getParameter("search_word_rdr"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String search_flag_rdr = Util.Uni2Ksc(Util.checkString(req.getParameter("search_flag_rdr")));
String search_word_rdr = Util.Uni2Ksc(Util.checkString(req.getParameter("search_word_rdr")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setSearch_flag_rdr(search_flag_rdr);
dm.setSearch_word_rdr(search_word_rdr);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Mar 06 10:04:19 GMT 2013 */
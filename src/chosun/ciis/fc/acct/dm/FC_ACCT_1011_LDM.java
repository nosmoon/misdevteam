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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_1011_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mang_item_cd;

	public FC_ACCT_1011_LDM(){}
	public FC_ACCT_1011_LDM(String cmpy_cd, String mang_item_cd){
		this.cmpy_cd = cmpy_cd;
		this.mang_item_cd = mang_item_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMang_item_cd(String mang_item_cd){
		this.mang_item_cd = mang_item_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMang_item_cd(){
		return this.mang_item_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_1011_L(? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_1011_LDM dm = (FC_ACCT_1011_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mang_item_cd);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_1011_LDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("mang_item_cd = " + getMang_item_cd());
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
String mang_item_cd = req.getParameter("mang_item_cd");
if( mang_item_cd == null){
	System.out.println(this.toString+" : mang_item_cd is null" );
}else{
	System.out.println(this.toString+" : mang_item_cd is "+mang_item_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mang_item_cd = Util.checkString(req.getParameter("mang_item_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mang_item_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_item_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setMang_item_cd(mang_item_cd);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 20 16:54:51 KST 2009 */
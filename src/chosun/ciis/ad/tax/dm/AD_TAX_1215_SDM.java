/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 2009-01-29
* �ۼ��� : ���±�
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ad.tax.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */


public class AD_TAX_1215_SDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String pubc_slip_no;

	public AD_TAX_1215_SDM(){}
	public AD_TAX_1215_SDM(String cmpy_cd, String pubc_slip_no){
		this.cmpy_cd = cmpy_cd;
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getSQL(){
		 return "{ call SP_AD_TAX_1215_S( ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AD_TAX_1215_SDM dm = (AD_TAX_1215_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.pubc_slip_no);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ad.tax.ds.AD_TAX_1215_SDataSet();
	}



    public void print(){
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("pubc_slip_no = " + getPubc_slip_no());
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
String pubc_slip_no = req.getParameter("pubc_slip_no");
if( pubc_slip_no == null){
	System.out.println(this.toString+" : pubc_slip_no is null" );
}else{
	System.out.println(this.toString+" : pubc_slip_no is "+pubc_slip_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String pubc_slip_no = Util.checkString(req.getParameter("pubc_slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier���� �ѱ�ó���� ���ÿ� req.getParameter() ó���� ����Ͻʽÿ�.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String pubc_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("pubc_slip_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier���� DM ������ ������ ������ ����Ͻʽÿ�.

dm.setCmpy_cd(cmpy_cd);
dm.setPubc_slip_no(pubc_slip_no);
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 19 17:10:48 KST 2009 */
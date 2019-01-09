/***************************************************************************************************
* 파일명 : .java
* 기능 : 거래처인물정보
* 작성일자 : 2010.07.16
* 작성자 : KBS
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ad.bas.dm;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;

import oracle.jdbc.driver.OracleTypes;
import somo.framework.db.BaseDM;
import somo.framework.db.BaseDataSet;

/**
 * 
 */
public class AD_BAS_3611_SDM extends somo.framework.db.BaseDM implements java.io.Serializable
{
	public String cmpy_cd;
	public String medi_clsf;
	public String dlco_no;
	public String cust_seq;

	public AD_BAS_3611_SDM(){}
	public AD_BAS_3611_SDM(String cmpy_cd, String medi_clsf, String dlco_no, String cust_seq)
	{
		this.cmpy_cd = cmpy_cd;
		this.medi_clsf = medi_clsf;
		this.dlco_no = dlco_no;
		this.cust_seq = cust_seq;
	}

	public void setCmpyCd(String cmpy_cd)
	{
		this.cmpy_cd = cmpy_cd;
	}
	public void setMediClsf(String medi_clsf)
	{
		this.medi_clsf = medi_clsf;
	}
	public void setDlcoNo(String dlco_no)
	{
		this.dlco_no = dlco_no;
	}
	public void setCustSeq(String cust_seq)
	{
		this.cust_seq = cust_seq;
	}

	public String getCmpyCd()
	{
		return this.cmpy_cd;
	}
	public String getMediClsf()
	{
		return this.medi_clsf;
	}
	public String getDlcoNo()
	{
		return this.dlco_no;
	}
	public String getCustSeq()
	{
		return this.cust_seq;
	}

	public String getSQL()
	{
		 return "{ call SP_AD_BAS_3611_S( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException
	{
		AD_BAS_3611_SDM dm = (AD_BAS_3611_SDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.medi_clsf);
		cstmt.registerOutParameter(4, Types.VARCHAR);
		cstmt.setString(5, dm.dlco_no);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.setString(6, dm.cust_seq);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, Types.VARCHAR);
		cstmt.registerOutParameter(24, Types.VARCHAR);
		cstmt.registerOutParameter(25, Types.VARCHAR);
		cstmt.registerOutParameter(26, Types.VARCHAR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
		cstmt.registerOutParameter(39, Types.VARCHAR);
		cstmt.registerOutParameter(40, Types.VARCHAR);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, Types.VARCHAR);
		cstmt.registerOutParameter(43, Types.VARCHAR);
		cstmt.registerOutParameter(44, Types.VARCHAR);
		cstmt.registerOutParameter(45, Types.VARCHAR);
		cstmt.registerOutParameter(46, Types.VARCHAR);
		cstmt.registerOutParameter(47, Types.VARCHAR);
		cstmt.registerOutParameter(48, Types.VARCHAR);
		cstmt.registerOutParameter(49, Types.VARCHAR);
		cstmt.registerOutParameter(50, Types.VARCHAR);
		cstmt.registerOutParameter(51, Types.VARCHAR);
		cstmt.registerOutParameter(52, Types.VARCHAR);
		cstmt.registerOutParameter(53, Types.VARCHAR);
		cstmt.registerOutParameter(54, Types.VARCHAR);
		cstmt.registerOutParameter(55, Types.VARCHAR);
		cstmt.registerOutParameter(56, Types.VARCHAR);
		cstmt.registerOutParameter(57, Types.VARCHAR);
		cstmt.registerOutParameter(58, Types.VARCHAR);
		cstmt.registerOutParameter(59, OracleTypes.CURSOR);
		cstmt.registerOutParameter(60, OracleTypes.CURSOR);
		cstmt.registerOutParameter(61, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject()
	{
		return new chosun.ciis.ad.bas.ds.AD_BAS_3611_SDataSet();
	}

    public void print()
    {
        System.out.println("cmpy_cd = " + getCmpyCd());
        System.out.println("medi_clsf = " + getMediClsf());
        System.out.println("dlco_no = " + getDlcoNo());
        System.out.println("cust_seq = " + getCustSeq());
    }
}
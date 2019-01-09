/*
//p ackage KISA;

public class SHA256
{
  private static Boolean _LITTLE = Boolean.valueOf(false);
  private static Boolean _BIG = Boolean.valueOf(true);

  private static Boolean _ENDIAN = _BIG;

  private static int _SHA256_DIGEST_BLOCKLEN = 64;
  private static int _SHA256_DIGEST_VALUELEN = 32;

  private static int[] _K = { 1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, 
    -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 
    1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 
    264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, 
    -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 
    113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 
    1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, 
    -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 
    430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 
    1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, 
    -1866530822, -1538233109, -1090935817, -965641998 };

  private int[] _ChainVar = { 1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225 }; private int[] _Count = new int[4]; private byte[] _Buffer = new byte[_SHA256_DIGEST_BLOCKLEN];
  private byte[] _bpDigest;

  private SHA256()
  {
  }

  public SHA256(byte[] bpMessage)
  {
    SHA256_Update(bpMessage); SHA256_Final();
  }

  public byte[] GetHashCode()
  {
    return this._bpDigest;
  }

  private void SHA256_Update(byte[] bpMessage)
  {
    int nMessageLen = bpMessage.length;
    int nMessageIndex = 0;

    this._Count[0] += (nMessageLen << 3);
    if (this._Count[0] < 0) {
      this._Count[1] += 1;
    }

    this._Count[1] += (nMessageLen >> 29);

    while (nMessageLen >= _SHA256_DIGEST_BLOCKLEN)
    {
      for (int i = 0; i < _SHA256_DIGEST_BLOCKLEN; i++) {
        this._Buffer[i] = bpMessage[(nMessageIndex + i)];
      }
      SHA256_Transform();
      nMessageIndex += _SHA256_DIGEST_BLOCKLEN;
      nMessageLen -= _SHA256_DIGEST_BLOCKLEN;
    }

    for (int i = 0; i < nMessageLen; i++)
      this._Buffer[i] = bpMessage[(nMessageIndex + i)];
  }

  private void SHA256_Final()
  {
    int nCountL = this._Count[0];
    int nCountH = this._Count[1];

    int nIndex = (nCountL >> 3) % _SHA256_DIGEST_BLOCKLEN;
    this._Buffer[(nIndex++)] = -128;

    if (nIndex > _SHA256_DIGEST_BLOCKLEN - 8)
    {
      for (int i = nIndex; i < _SHA256_DIGEST_BLOCKLEN; i++)
        this._Buffer[i] = 0;
      SHA256_Transform();
      for (int i = 0; i < _SHA256_DIGEST_BLOCKLEN - 8; i++)
        this._Buffer[i] = 0;
    }
    else {
      for (int i = nIndex; i < _SHA256_DIGEST_BLOCKLEN - 8; i++) {
        this._Buffer[i] = 0;
      }
    }
    if (_ENDIAN == _LITTLE)
    {
      nCountL = ENDIAN_REVERSE_ULONG(nCountL);
      nCountH = ENDIAN_REVERSE_ULONG(nCountH);
    }

    for (int i = 0; i < 4; i++)
    {
      this._Buffer[(_SHA256_DIGEST_BLOCKLEN - 1 - i)] = (byte)((nCountL & 255 << 8 * i) >>> 8 * i);
      this._Buffer[(_SHA256_DIGEST_BLOCKLEN - 5 - i)] = (byte)((nCountH & 255 << 8 * i) >>> 8 * i);
    }

    SHA256_Transform();

    this._bpDigest = new byte[_SHA256_DIGEST_VALUELEN];

    for (int i = 0; i < _SHA256_DIGEST_VALUELEN; i++)
      this._bpDigest[i] = (byte)((this._ChainVar[(i / 4)] & -16777216 >>> 8 * (i % 4)) >>> 32 - 8 * ((i + 1) % 4));
  }

  private void SHA256_Transform()
  {
    int[] X = new int[64];

    for (int j = 0; j < 16; j++)
    {
      int T1 = 0;
      for (int i = 0; i < 4; i++)
        T1 |= (0xFF & this._Buffer[(i + 4 * j)]) << 24 - 8 * i;
      X[j] = GetData(T1);
    }
    for (int j = 16; j < 64; j++)
    {
      X[j] = (RHO1(X[(j - 2)]) + X[(j - 7)] + RHO0(X[(j - 15)]) + X[(j - 16)]);
    }

    int a = this._ChainVar[0];
    int b = this._ChainVar[1];
    int c = this._ChainVar[2];
    int d = this._ChainVar[3];
    int e = this._ChainVar[4];
    int f = this._ChainVar[5];
    int g = this._ChainVar[6];
    int h = this._ChainVar[7];

    for (int j = 0; j < 64; j += 8)
    {
      int T1 = FF0(e, f, g, h, j + 0, X); d += T1; h = FF1(T1, a, b, c);
      T1 = FF0(d, e, f, g, j + 1, X); c += T1; g = FF1(T1, h, a, b);
      T1 = FF0(c, d, e, f, j + 2, X); b += T1; f = FF1(T1, g, h, a);
      T1 = FF0(b, c, d, e, j + 3, X); a += T1; e = FF1(T1, f, g, h);
      T1 = FF0(a, b, c, d, j + 4, X); h += T1; d = FF1(T1, e, f, g);
      T1 = FF0(h, a, b, c, j + 5, X); g += T1; c = FF1(T1, d, e, f);
      T1 = FF0(g, h, a, b, j + 6, X); f += T1; b = FF1(T1, c, d, e);
      T1 = FF0(f, g, h, a, j + 7, X); e += T1; a = FF1(T1, b, c, d);
    }

    this._ChainVar[0] += a;
    this._ChainVar[1] += b;
    this._ChainVar[2] += c;
    this._ChainVar[3] += d;
    this._ChainVar[4] += e;
    this._ChainVar[5] += f;
    this._ChainVar[6] += g;
    this._ChainVar[7] += h;
  }

  private int FF0(int e, int f, int g, int h, int j, int[] X) {
    return h + Sigma1(e) + Ch(e, f, g) + _K[j] + X[j]; } 
  private int FF1(int T1, int a, int b, int c) { return T1 + Sigma0(a) + Maj(a, b, c); }

  private int Ch(int x, int y, int z) {
    return x & y ^ (x ^ 0xFFFFFFFF) & z; } 
  private int Maj(int x, int y, int z) { return x & y ^ x & z ^ y & z; } 
  private int Sigma0(int x) { return RR(x, 2) ^ RR(x, 13) ^ RR(x, 22); } 
  private int Sigma1(int x) { return RR(x, 6) ^ RR(x, 11) ^ RR(x, 25); }

  private int GetData(int nX)
  {
    if (_ENDIAN == _BIG) {
      return nX;
    }
    return ENDIAN_REVERSE_ULONG(nX);
  }

  private int ENDIAN_REVERSE_ULONG(int nX) {
    return ROTL_ULONG(nX, 8) & 0xFF00FF | ROTL_ULONG(nX, 24) & 0xFF00FF00;
  }
  private int ROTL_ULONG(int x, int n) {
    return x << n | x >>> 32 - n; } 
  private int ROTR_ULONG(int x, int n) { return x >>> n | x << 32 - n; } 
  private int RR(int x, int n) { return ROTR_ULONG(x, n); }

  private int SS(int x, int n) {
    return x >>> n;
  }
  private int RHO0(int x) { return RR(x, 7) ^ RR(x, 18) ^ SS(x, 3); } 
  private int RHO1(int x) { return RR(x, 17) ^ RR(x, 19) ^ SS(x, 10);
  }
}

*/
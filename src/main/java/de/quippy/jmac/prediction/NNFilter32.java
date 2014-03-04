/*
 *  21.04.2004 Original verion. davagin@udm.ru.
 *-----------------------------------------------------------------------
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *----------------------------------------------------------------------
 */

package de.quippy.jmac.prediction;


/**
 * Author: Dmitry Vaguine
 * Date: 04.03.2004
 * Time: 14:51:31
 */
public class NNFilter32 extends NNFilter {

    public NNFilter32(int nShift, int nVersion) {
        super(32, nShift, nVersion);
        orderPlusWindow = 544 /* NN_WINDOW_ELEMENTS + m_nOrder */;
    }

    protected int CalculateDotProductNoMMX(final short[] pA, int indexA, final short[] pB, int indexB) {
        return (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]) +
                (pA[indexA++] * pB[indexB++]);
    }

    protected void AdaptNoMMX(final short[] pM, int indexM, final short[] pAdapt, int indexA, final int nDirection) {
        if (nDirection < 0) {
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
            pM[indexM++] += pAdapt[indexA++];
        } else if (nDirection > 0) {
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
            pM[indexM++] -= pAdapt[indexA++];
        }
    }
}

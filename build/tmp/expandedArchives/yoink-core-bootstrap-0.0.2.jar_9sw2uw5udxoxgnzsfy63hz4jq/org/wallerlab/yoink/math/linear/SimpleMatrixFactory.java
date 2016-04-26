/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wallerlab.yoink.math.linear;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.wallerlab.yoink.api.service.math.Matrix;

@Service
public class SimpleMatrixFactory {

	private Matrix.Type matrixType;

	public Matrix matrix() {
		Matrix newMatrixInstance;
		switch (matrixType) {
		case COMMONS:
			newMatrixInstance = new CommonsMatrix();
			break;
		default:
			newMatrixInstance = null;
			throw new IllegalArgumentException("Invalid type of matrix: "
					+ matrixType);
		}
		return newMatrixInstance;
	}

	public Matrix matrix3x3() {
		Matrix newMatrixInstance;
		newMatrixInstance = new CommonsMatrix(3, 3);
		return newMatrixInstance;
	}

	public Matrix vector3D() {
		Matrix newMatrixInstance;
		newMatrixInstance = new CommonsMatrix(1, 3);
		return newMatrixInstance;
	}

	@Value("${yoink.job.mymatrixtype}")
	public void setMatrixType(Matrix.Type matrixType) {
		this.matrixType = matrixType;
	}

}

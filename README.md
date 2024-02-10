# API de Operaciones de Strings

Esta API proporciona operaciones de utilidad para gestionar strings.

## Endpoints

### Concatenar Strings

- **URL**: `/concat`
- **Método**: `GET`
- **Parámetros de consulta**:
  - `str1`: Primer string para concatenar.
  - `str2`: Segundo string para concatenar.
- **Respuesta**: Una string que es la concatenación de `str1` y `str2`.

### Obtener Substring

- **URL**: `/substring`
- **Método**: `GET`
- **Parámetros de consulta**:
  - `str`: La string de la que obtener el substring.
  - `beginIndex`: El índice inicial del substring.
  - `endIndex`: El índice final del substring.
- **Respuesta**: Un substring de `str` que comienza en `beginIndex` y termina en `endIndex`.

### Comprobar si una String Contiene otra String

- **URL**: `/contains`
- **Método**: `GET`
- **Parámetros de consulta**:
  - `str`: La string en la que buscar.
  - `searchStr`: La string a buscar.
- **Respuesta**: `true` si `str` contiene `searchStr`, `false` en caso contrario.

### Reemplazar String

- **URL**: `/replace`
- **Método**: `GET`
- **Parámetros de consulta**:

  - `str`: La string en la que reemplazar.
  - `oldStr`: La string a reemplazar.
  - `newStr`: La string que reemplazará a `oldStr`.

- **Respuesta**: Una string que es el resultado de reemplazar todas las ocurrencias de `oldStr` por `newStr` en `str`.

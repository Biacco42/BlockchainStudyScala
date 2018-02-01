package info.biacco42.app.study.blockcahin

case class Block(header: BlockHeader, transactions: List[Transaction])

case class BlockHeader(previousHeaderHash: String, merkleRoot: String, difficulty: Int, nonce: Int)

case class Transaction(id: String, inputs: List[TransactionInput], outputs: List[TransactionOutput])

case class TransactionInput(transactionID: String, outputIndex: Int, signatureScript: SignatureScript)

case class SignatureScript(publicKey: String, signature: String)

case class TransactionOutput(amount: Int, publicKeyScript: PublicKeyScript)

case class PublicKeyScript(publicKeyHash: String)